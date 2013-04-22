/**
 *
 */
package es.androidespixelados.gestorpartida.controlador;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import es.androidespixelados.gestorpartida.persistencia.GestorPartidaSQLHelper;

/**
 * Actividad base para el resto de actividades de la aplicación.
 * Aquí están los métodos comunes de todas ellas.
 * 
 * @author Loïc Prieto.
 * 
 */
public abstract class ActividadBase extends Activity {

	/**
	 * Obtiene una conexión a la base de datos, en la modalidad en la que se le indique.
	 * 
	 * @param tipoConexion
	 *            el tipo de conexión que se desea obtener.
	 * 
	 * @return la conexión inicializada en la modalidad deseada.
	 */
	protected SQLiteDatabase obtenerConexionABDD(TipoConexionBDD tipoConexion) {
		GestorPartidaSQLHelper sqlHelper = GestorPartidaSQLHelper.getHelper(ActividadBase.this);
		SQLiteDatabase db = null;
		switch (tipoConexion) {
			case ESCRITURA: {
				db = sqlHelper.getWritableDatabase();
				break;
			}
			case SOLO_LECTURA: {
				db = sqlHelper.getReadableDatabase();
			}
			default: {
				db = sqlHelper.getReadableDatabase();
			}
		}

		return db;
	}

	/**
	 * Android siempre va a devolver una conexión de escritura, por lo que no merece la pena especificar
	 * cual deseas.
	 * No obstante, se deja el método original especificando tipo por si acaso.
	 * 
	 * @return una conexión de escritura/lectura inicializada.
	 */
	protected SQLiteDatabase obtenerConexionABDD() {
		return this.obtenerConexionABDD(TipoConexionBDD.ESCRITURA);
	}
}
