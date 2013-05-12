/**
 * 
 */
package es.androidespixelados.gestorpartida.modelo;

import android.util.SparseArray;
import es.androidespixelados.gestorpartida.persistencia.EnumeracionPersistente;

/**
 * Una enumeración de los tipos de datos sintácticos que puede ser un tipo de atributo o parametro.
 * Sirve más que nada para la validación sintáctica en la interfaz de usuario.
 * 
 * @author Loïc Prieto
 * 
 */
public enum TipoDato implements EnumeracionPersistente<Integer> {
	/**
	 * Un entero.
	 */
	ENTERO(0),
	/**
	 * Un numero decimal.
	 */
	REAL(1),
	/**
	 * Un texto de longitud variable.
	 */
	TEXTO(2),
	/**
	 * Un atributo puede no tener ningún tipo, sino simplemente ser su presencia suficiente
	 * para definir a un personaje. Por ejemplo: es inmune a enfermedades.
	 */
	VACIO(3);

	/**
	 * El valor que se escribirá en base de datos respecto del atributo
	 * de esta enumeración.
	 */
	private Integer							valorPersistente;

	/**
	 * El mapa que relaciona los enteros con los valores del enum.
	 */
	private static SparseArray<TipoDato>	tipos	= new SparseArray<TipoDato>();

	static {
		for (TipoDato tipo : TipoDato.values()) {
			tipos.put(tipo.valorPersistente, tipo);
		}
	}

	/**
	 * Constructor.
	 */
	private TipoDato(int valorPersistente) {
		this.valorPersistente = valorPersistente;
	}

	/**
	 * Obtiene un valor de esta enumeración a partir de su valor persistente.
	 */
	public static TipoDato desdeValorPersistente(Integer valorPersistente) {
		return tipos.get(valorPersistente);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getValorPersistente() {
		return valorPersistente;
	}
}
