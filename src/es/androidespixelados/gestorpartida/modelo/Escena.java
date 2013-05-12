/**
 *
 */
package es.androidespixelados.gestorpartida.modelo;

import java.util.List;

/**
 * Una escena es un lugar espacio temporal del universo de la partida.
 * Contiene un listado de posibles encuentros, de personajes, de tramas asociadas a la escena, imágenes, listados
 * de música, etc.
 * 
 * @author Loïc Prieto
 * 
 */
public class Escena extends ModeloBase {

	/**
	 * Los posibles personajes participantes en la escena.
	 */
	private List<? extends Personaje>	personajes;

	/**
	 * Las posibles tramas.
	 */
	private List<Trama>					tramas;

	/**
	 * Los potenciales encuentros.
	 */
	private List<? extends Encuentro>	encuentros;

	/**
	 * Obtiene el personajes.
	 * 
	 * @return personajes.
	 */
	public List<? extends Personaje> getPersonajes() {
		return personajes;
	}

	/**
	 * Establece el personajes
	 * 
	 * @param personajes
	 *            establece personajes a personajes
	 * @return el objeto
	 */
	public void setPersonajes(List<? extends Personaje> personajes) {
		this.personajes = personajes;
	}

	/**
	 * Obtiene el tramas.
	 * 
	 * @return tramas.
	 */
	public List<Trama> getTramas() {
		return tramas;
	}

	/**
	 * Establece el tramas
	 * 
	 * @param tramas
	 *            establece tramas a tramas
	 * @return el objeto
	 */
	public void setTramas(List<Trama> tramas) {
		this.tramas = tramas;
	}

	/**
	 * Obtiene el encuentros.
	 * 
	 * @return encuentros.
	 */
	public List<? extends Encuentro> getEncuentros() {
		return encuentros;
	}

	/**
	 * Establece el encuentros
	 * 
	 * @param encuentros
	 *            establece encuentros a encuentros
	 * @return el objeto
	 */
	public void setEncuentros(List<? extends Encuentro> encuentros) {
		this.encuentros = encuentros;
	}

}
