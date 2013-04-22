/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

import android.database.Cursor;

/**
 * Una extensión de la interfaz Cursor para poder seleccionar los valores
 * de un registro por el nombre de la columna en vez de por su índice.
 * 
 * @author Loïc Prieto.
 * 
 */
public interface CursorAP extends Cursor {

	/**
	 * Obtiene un campo del registro través del nombre de la columna.
	 * 
	 * @param nombreColumna
	 *            el nombre de la columna.
	 * 
	 * @return el valor del campo o nulo si no existe.
	 */
	String getString(String nombreColumna);

	/**
	 * Obtiene un campo del registro través del nombre de la columna.
	 * 
	 * @param nombreColumna
	 *            el nombre de la columna.
	 * 
	 * @return el valor del campo o nulo si no existe.
	 */
	long getLong(String nombreColumna);

	/**
	 * Obtiene un campo del registro través del nombre de la columna.
	 * 
	 * @param nombreColumna
	 *            el nombre de la columna.
	 * 
	 * @return el valor del campo o nulo si no existe.
	 */
	int getInt(String nombreColumna);

	/**
	 * Obtiene un campo del registro través del nombre de la columna.
	 * 
	 * @param nombreColumna
	 *            el nombre de la columna.
	 * 
	 * @return el valor del campo o nulo si no existe.
	 */
	float getFloat(String nombreColumna);

	/**
	 * Obtiene un campo del registro través del nombre de la columna.
	 * 
	 * @param nombreColumna
	 *            el nombre de la columna.
	 * 
	 * @return el valor del campo o nulo si no existe.
	 */
	double getDouble(String nombreColumna);

}
