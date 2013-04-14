/**
 * 
 */
package es.androidespixelados.gestorpartida.modelo;

/**
 * Una enumeración de los tipos de datos sintácticos que puede ser un tipo de atributo o parametro.
 * Sirve más que nada para la validación sintáctica en la interfaz de usuario.
 * 
 * @author Loïc Prieto
 * 
 */
public enum TipoDato {
	/**
	 * Un entero.
	 */
	Entero,
	/**
	 * Un numero decimal.
	 */
	Decimal,
	/**
	 * Un texto de longitud variable.
	 */
	Texto
}
