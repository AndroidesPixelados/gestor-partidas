package es.androidespixelados.gestorpartida.dd4.modelo;

import android.util.SparseArray;
import es.androidespixelados.gestorpartida.persistencia.EnumeracionPersistente;

/**
 * Enumerador de las diferentes resistencias que puede tener
 * un actor
 * 
 * @author Javi Montes
 *
 */
public enum Resistencias implements EnumeracionPersistente<Integer> {
	
	/** Resistencia al frío **/
	FRIO(0),
	
	/** Resistencia al calor **/
	CALOR(1),
	
	/** Resistencia al daño radiante **/
	RADIANTE(2);
	
	/**
	 * El valor que se escribirá en base de datos respecto del atributo
	 * de esta enumeración.
	 */
	private Integer								valorPersistente;
	
	/**
	 * El mapa que relaciona los enteros con los valores del enum.
	 */
	private static SparseArray<Resistencias>	resistencias	= new SparseArray<Resistencias>();

	static {
		for (Resistencias resistencia : Resistencias.values()) {
			resistencias.put(resistencia.valorPersistente, resistencia);
		}
	}
	
	/**
	 * Constructor
	 */
	private Resistencias(int valorPersistente) {
		this.valorPersistente = valorPersistente;
	}
	
	/**
	 * Obtiene un valor de esta enumeración a partir de su valor persistente.
	 */
	public static Resistencias desdeValorPersistente(Integer valorPersistente) {
		return resistencias.get(valorPersistente);
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public Integer getValorPersistente() {
		return valorPersistente;
	}

	
}
