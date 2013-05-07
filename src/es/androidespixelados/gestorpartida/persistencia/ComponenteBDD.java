/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.yaml.snakeyaml.Yaml;

import android.app.Application;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.util.ComponenteI18N;

/**
 * Un componente de interacción con la base de datos a inyectar en las clases que sean necesarias.
 * 
 * Define las operaciones básicas de consulta y actualización.
 * A medida que el proyecto vaya progresando, posiblemente vayan creciendo esta clase
 * así como sus posibilidades (un buen signo de un análisis precario ;-) ).
 * 
 * @author Loïc Prieto
 * 
 */
@Singleton
public class ComponenteBDD {

	@Inject
	private GestorPartidaSQLHelper	gestorSQL;

	@Inject
	private ComponenteI18N			i18n;

	/**
	 * Un contexto android para poder obtener los recursos de la aplicación.
	 */
	@Inject
	private Application				contexto;

	/**
	 * Contenedor de las consultas SQL disponibles en la aplicación.
	 */
	private Map<String, String>		consultasSQL;

	/**
	 * Ejecuta una consulta en la base de datos.
	 * Los parametros se remplazan en la consulta por su nombre.
	 * Ejemplo:
	 * consulta: select * from tablalol where nombre like '${nombre}%'
	 * 
	 * @param consulta
	 *            la consulta sql
	 * @param parametros
	 *            los parametros, cuya clave de mapa es el nombre del mismo.
	 * @return el cursor SQL resultante de la consulta.
	 */
	public CursorAP ejecutarConsulta(String consulta, Map<String, Object> parametros) {
		CursorAP resultado = null;

		SQLiteDatabase db = gestorSQL.getWritableDatabase();

		String consultaParseada = null;
		if ((parametros != null) && !parametros.isEmpty()) {
			consultaParseada = aplicarParametros(consulta, parametros);
		}

		Cursor resultadoIntermedio = null;
		if (consultaParseada != null) {
			resultadoIntermedio = db.rawQuery(consultaParseada, null);
		} else {
			resultadoIntermedio = db.rawQuery(consulta, null);
		}
		if (resultadoIntermedio != null) {
			resultado = new DecoradorCursorAP(resultadoIntermedio);
		}

		return resultado;
	}

	/**
	 * Ejecuta una consulta en la base de datos.
	 * Los parametros se remplazan en la consulta por su nombre.
	 * Ejemplo:
	 * consulta: select * from tablalol where nombre like '${nombre}%'
	 * 
	 * @param idConsulta
	 *            el identificador de la consulta en el fichero yaml.
	 * @param parametros
	 *            los parametros, cuya clave de mapa es el nombre del mismo.
	 * @return el cursor SQL resultante de la consulta.
	 */
	public CursorAP ejecutarConsulta(EnumConsultaSQL idConsulta, Map<String, Object> parametros) {
		String consulta = null;

		if (this.consultasSQL == null) {
			this.consultasSQL = cargarConsultas();
		}

		if (consultasSQL.containsKey(idConsulta.getClaveSQL())) {
			consulta = consultasSQL.get(idConsulta.getClaveSQL());
		} else {
			throw new IllegalArgumentException(i18n.getTexto(R.string.errores_consulta_sql_no_existente, idConsulta));
		}

		return ejecutarConsulta(consulta, parametros);
	}

	/**
	 * Ejecuta una consulta en la base de datos.
	 * 
	 * @param idConsulta
	 *            el identificador de la consulta en el fichero yaml.
	 * @return el cursor SQL resultante de la consulta.
	 */
	public CursorAP ejecutarConsulta(EnumConsultaSQL idConsulta) {
		return ejecutarConsulta(idConsulta, null);
	}

	/**
	 * Carga las consultas SQL almacenadas en los ficheros yaml de la carpeta assets/sql.
	 * Comprueba que no existen consultas duplicadas (identificadas por su clave).
	 * 
	 * @return
	 * @throws RuntimeException
	 *             si existe una clave duplicada
	 */
	@SuppressWarnings("unchecked")
	private Map<String, String> cargarConsultas() {
		Map<String, String> consultas = new HashMap<String, String>();

		try {
			AssetManager manager = contexto.getAssets();
			String[] ficheros = manager.list("sql");
			for (String fichero : ficheros) {
				if (fichero.endsWith(".yaml")) {
					Yaml parseador = new Yaml();
					Map<String, String> resultado = (Map<String, String>) parseador
							.load(manager.open("sql/" + fichero));

					// Comprobamos que no estamos sobreescribiendo una consulta ya existente. Lanzamos aviso
					// si es el caso. Es un error fatal.
					for (String clave : resultado.keySet()) {
						if (consultas.containsKey(clave)) {
							String mensajeError = i18n.getTexto(R.string.errores_consulta_sql_no_existente, clave,
									fichero);
							Log.e(this.getClass().toString(), mensajeError);
							throw new ClaveDuplicadaException(clave, fichero, mensajeError);
						}
					}
					consultas.putAll(resultado);
				}
			}

		} catch (IOException ioe) {
			String mensajeError = i18n.getTexto(R.string.errores_apertura_fichero, ioe.getMessage());
			Log.e(this.getClass().toString(), mensajeError);
			throw new RuntimeException(mensajeError);
		}

		return consultas;
	}

	/**
	 * Remplaza los parámetros de la consulta, por los valores pasados en el mapa de parámetros.
	 * En la cadena SQL, los parámetros están de la forma ${nombreParametro}.
	 * 
	 * @param consulta
	 *            la cadena SQL que contiene los parametros a remplazar.
	 * @param parametros
	 * @return
	 */
	private String aplicarParametros(String consulta, Map<String, Object> parametros) {
		String resultado = "" + consulta;
		for (Entry<String, Object> parametro : parametros.entrySet()) {
			resultado = resultado.replaceAll("\\$\\{" + parametro.getKey() + "\\}", parametro.getValue().toString());
		}
		return resultado;
	}
}
