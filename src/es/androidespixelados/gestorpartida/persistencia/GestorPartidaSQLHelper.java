/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import es.androidespixelados.gestorpartida.R;

/**
 * La clase de utilidad para crear y actualizar la base de datos de la aplicación.
 * 
 * @author Loïc Prieto
 * 
 */
@Singleton
public class GestorPartidaSQLHelper extends SQLiteOpenHelper {

	/**
	 * Nombre de la carpeta donde están contenidos los scripts SQL.
	 * Ruta relativa de la carpeta Assets.
	 */
	private static final String			CARPETA_SQL				= "sql";
	/**
	 * Separador de ruta entre carpetas. Como estamos en Android, es /
	 */
	private static final String			SEPARADOR_RUTA			= "/";
	/**
	 * El nombre del fichero DDL de la base de datos de la aplicación.
	 */
	private static final String			FICHERO_CREACION		= "modelo.sql";

	/**
	 * El nombre del fichero con los datos de prueba de la aplicación.
	 */
	private static final String			FICHERO_DATOS_PRUEBA	= "datos_prueba.sql";

	/**
	 * Un contexto android para poder obtener los recursos de la aplicación.
	 */
	@Inject
	private static Provider<Context>	contextProvider;

	/**
	 * Constructor. Privado para obligar a usar el constructor singleton.
	 */
	public GestorPartidaSQLHelper() {
		super(contextProvider.get(), contextProvider.get().getString(R.string.db_nombre), null, Integer
				.parseInt(contextProvider.get().getString(R.string.db_version)));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		try {
			List<String> instruccionesSQLCreacion = obtenerSQLCreacion();
			List<String> instruccionesSQLDatosPrueba = obtenerSQLDatosPruebas();
			instruccionesSQLCreacion.addAll(instruccionesSQLDatosPrueba);

			db.beginTransaction();
			try {
				for (String instruccion : instruccionesSQLCreacion) {
					db.execSQL(instruccion);
				}
				db.setTransactionSuccessful();
			} finally {
				db.endTransaction();
			}

		} catch (IOException ioe) {
			Log.e(this.getClass().toString(), getString(R.string.errores_apertura_fichero, ioe.getMessage()));
		}

	}

	/**
	 * Obtiene las instrucciones SQL a ejecutar para la creación inicial de las tablas.
	 * 
	 * @return instrucciones SQL a ejecutar.
	 * @throws IOException
	 *             error de apertura de fichero.
	 */
	private List<String> obtenerSQLDatosPruebas() throws IOException {
		String contenido = obtenerContenidoFichero(CARPETA_SQL + SEPARADOR_RUTA + FICHERO_DATOS_PRUEBA);
		return obtenerSetenciasIndividuales(contenido);
	}

	/**
	 * Obtiene las instrucciones SQL a ejecutar para la creación inicial de las tablas.
	 * 
	 * @return instrucciones SQL a ejecutar.
	 * @throws IOException
	 *             error de apertura de fichero.
	 */
	private List<String> obtenerSQLCreacion() throws IOException {
		String contenido = obtenerContenidoFichero(CARPETA_SQL + SEPARADOR_RUTA + FICHERO_CREACION);
		return obtenerSetenciasIndividuales(contenido);
	}

	/**
	 * Obtiene las sentencias individuales a partir de una cadena de texto SQL cuyas instrucciones
	 * están separadas por ;
	 * 
	 * @param textoSQL
	 *            el texto SQL completo
	 * @return
	 */
	private List<String> obtenerSetenciasIndividuales(String textoSQL) {
		List<String> sentencias = new ArrayList<String>();
		String[] sentenciasIndividuales = textoSQL.split(";");
		for (String sentencia : sentenciasIndividuales) {
			sentencias.add(sentencia);
		}
		return sentencias;
	}

	/**
	 * Obtiene el contenido de texto de un fichero cuyo nombre se le pase, cargado de raíz de la carpeta assets.
	 * 
	 * @param nombreFichero
	 *            el nombre relativo del fichero desde la carpeta assets.
	 * @return el contenido del fichero.
	 * @throws IOException
	 */
	private String obtenerContenidoFichero(String nombreFichero) throws IOException {
		Context contexto = contextProvider.get();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(contexto.getAssets().open(nombreFichero)));

		String linea = br.readLine();
		while (linea != null) {
			sb.append(linea);
			linea = br.readLine();
		}

		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// LOL
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onConfigure(SQLiteDatabase db) {
		db.setForeignKeyConstraintsEnabled(true);
	}

	/**
	 * Método fachada para obtener un recurso string de la aplicación, a través del contexto asociado a este cargador
	 * SQL.
	 * 
	 * @param idString
	 *            el identificador del recurso, sacado de R.
	 * @return el recurso si existe, nulo sino. Si no hay contexto asociado, también devuelve nulo.
	 */
	private String getString(int idString, Object... params) {
		return contextProvider.get().getString(idString, params);
	}

}