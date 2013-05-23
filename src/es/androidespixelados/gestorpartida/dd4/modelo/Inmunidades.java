/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import android.util.SparseArray;
import es.androidespixelados.gestorpartida.persistencia.EnumeracionPersistente;

/**
 * Enumerador de los diferentes tipos de inmunidad que puede
 * tener un actor
 * 
 * @author Javi Montes
 *
 */
public enum Inmunidades implements EnumeracionPersistente<Integer>{
	
	/** Inmunidad al miedo **/
	MIEDO(0),
	
	/** Inmunidad a ceguera **/
	CEGUERA(1),
	
	/** Inmunidad a enfermedad **/
	ENFERMEDAD(2);
	
	/**
	 * El valor que se escribirá en base de datos respecto del atributo
	 * de esta enumeración.
	 */
	private Integer								valorPersistente;
	
	/**
	 * El mapa que relaciona los enteros con los valores del enum.
	 */
	private static SparseArray<Inmunidades>	inmunidades	= new SparseArray<Inmunidades>();

	static {
		for (Inmunidades inmunidad : Inmunidades.values()) {
			inmunidades.put(inmunidad.valorPersistente, inmunidad);
		}
	}
	
	/**
	 * Constructor
	 */
	private Inmunidades(int valorPersistente) {
		this.valorPersistente = valorPersistente;
	}
	
	/**
	 * Obtiene un valor de esta enumeración a partir de su valor persistente.
	 */
	public static Inmunidades desdeValorPersistente(Integer valorPersistente) {
		return inmunidades.get(valorPersistente);
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public Integer getValorPersistente() {
		return valorPersistente;
	}

}
