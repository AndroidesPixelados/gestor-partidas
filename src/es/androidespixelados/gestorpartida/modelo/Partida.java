/**
 *
 */
package es.androidespixelados.gestorpartida.modelo;

import java.util.List;

/**
 * TO DO: Comentar para que ramoncín no llore
 * @author Javi Montes
 *
 */
public class Partida extends ModeloBase {
	
	/**
	 * El sistema usado para la partida.
	 */
	private Sistema	sistema;
	
	/**
	 * Lista de tramas usadas en la partida
	 */
	private List<Trama> tramas;

	/**
	 * Obtiene el sistema.
	 * @return sistema.
	 */
	public Sistema getSistema() {
		return sistema;
	}

	/**
	 * Establece el  sistema
	 * @param sistema establece sistema a sistema
	 * @return el objeto
	 */
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	/**
	 * Obtiene el tramas.
	 * @return tramas.
	 */
	public List<Trama> getTramas() {
		return tramas;
	}

	/**
	 * Establece el  tramas
	 * @param tramas establece tramas a tramas
	 * @return el objeto
	 */
	public void setTramas(List<Trama> tramas) {
		this.tramas = tramas;
	}
	
	

}
