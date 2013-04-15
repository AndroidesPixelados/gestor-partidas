/**
 *
 */
package es.androidespixelados.gestorpartida.controlador;

/**
 * La modalidad en la que puede obtenerse una conexión a la base de datos de la aplicación.
 * 
 * @author Loïc Prieto
 * 
 */
public enum TipoConexionBDD {
	/**
	 * Flag para abrir la base de datos en modo solo lectura.
	 */
	SOLO_LECTURA,
	/**
	 * Flag para abrir la base de datos en modo de escritura.
	 */
	ESCRITURA
}
