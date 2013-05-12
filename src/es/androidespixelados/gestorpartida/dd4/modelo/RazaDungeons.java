/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import android.util.SparseArray;
import es.androidespixelados.gestorpartida.persistencia.EnumeracionPersistente;

/**
 * Los distintos valores que puede tomar el atributo raza de un personaje en dungeons.
 * 
 * @author Loïc Prieto
 * 
 */
public enum RazaDungeons implements EnumeracionPersistente<Integer> {
	/**
	 * raza humana.
	 */
	HUMANO(0),
	/**
	 * raza elfica.
	 */
	ELFO(1),
	/**
	 * raza enana.
	 */
	ENANO(2),
	/**
	 * raza semielfo.
	 */
	SEMIELFO(3);

	/**
	 * El valor que se escribirá en base de datos respecto del atributo
	 * de esta enumeración.
	 */
	private Integer								valorPersistente;

	/**
	 * El mapa que relaciona los enteros con los valores del enum.
	 */
	private static SparseArray<RazaDungeons>	razas	= new SparseArray<RazaDungeons>();

	static {
		for (RazaDungeons raza : RazaDungeons.values()) {
			razas.put(raza.valorPersistente, raza);
		}
	}

	/**
	 * Constructor.
	 */
	private RazaDungeons(int valorPersistente) {
		this.valorPersistente = valorPersistente;
	}

	/**
	 * Obtiene un valor de esta enumeración a partir de su valor persistente.
	 */
	public static RazaDungeons desdeValorPersistente(Integer valorPersistente) {
		return razas.get(valorPersistente);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getValorPersistente() {
		return valorPersistente;
	}
}
