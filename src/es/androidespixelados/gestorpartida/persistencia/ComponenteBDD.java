/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

import java.util.Map;
import java.util.Map.Entry;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.google.inject.Inject;
import com.google.inject.Singleton;

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
	 * Ejecuta una consulta en la base de datos.
	 * Los parametros se remplazan en la consulta por su nombre.
	 * Ejemplo:
	 * consulta: select * from tablalol where nombre like '${manol}%'
	 * 
	 * @param consulta
	 *            la consulta sql
	 * @param parametros
	 *            los parametros, cuya clave de mapa es el nombre del mismo.
	 * @return el cursor SQL resultante de la consulta.
	 */
	public Cursor ejecutarConsulta(String consulta, Map<String, Object> parametros) {
		Cursor resultado = null;

		SQLiteDatabase db = gestorSQL.getWritableDatabase();

		String consultaParseada = null;
		if ((parametros != null) && !parametros.isEmpty()) {
			consultaParseada = aplicarParametros(consulta, parametros);
		}

		if (consultaParseada != null) {
			resultado = db.rawQuery(consultaParseada, null);
		} else {
			resultado = db.rawQuery(consulta, null);
		}

		return resultado;
	}

	/**
	 * Ejecuta una consulta en la base de datos.
	 * Los parametros se remplazan en la consulta por su nombre.
	 * Ejemplo:
	 * consulta: select * from tablalol where nombre like '${manol}%'
	 * 
	 * @param consulta
	 *            el id en la clase R de la consulta en un fichero de recursos.
	 * @param parametros
	 *            los parametros, cuya clave de mapa es el nombre del mismo.
	 * @return el cursor SQL resultante de la consulta.
	 */
	public Cursor ejecutarConsulta(int idConsulta, Map<String, Object> parametros) {
		String consulta = i18n.getTexto(idConsulta);
		return ejecutarConsulta(consulta, parametros);
	}

	/**
	 * Ejecuta una consulta en la base de datos.
	 * 
	 * @param consulta
	 *            el id en la clase R de la consulta en un fichero de recursos.
	 * @return el cursor SQL resultante de la consulta.
	 */
	public Cursor ejecutarConsulta(int idConsulta) {
		return ejecutarConsulta(idConsulta, null);
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
