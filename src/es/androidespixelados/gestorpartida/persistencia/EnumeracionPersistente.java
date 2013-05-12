/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

/**
 * Una enumeración cuyos valores vayan a ser persistidos, necesita un valor que escribir.
 * Los métodos de esta interfaz permiten a la enumeración declarar los métodos que usarán
 * otras clases para obtener esos valores.
 * 
 * @author Loïc Prieto
 * 
 */
public interface EnumeracionPersistente<TipoValorPersistente> {
	/**
	 * Obtiene el valor persistente del atributo de una enumeración.
	 * 
	 * @return
	 */
	TipoValorPersistente getValorPersistente();

}
