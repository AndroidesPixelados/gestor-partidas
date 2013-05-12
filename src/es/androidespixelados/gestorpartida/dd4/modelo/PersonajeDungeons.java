/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.Personaje;

/**
 * Clase genérica de personaje para el sistema D&D4
 * 
 * @author Javi Montes
 * 
 */
public class PersonajeDungeons extends Personaje {

	/**
	 * Ruta donde se almacena la ficha personaje
	 */
	private String		ruta;

	/**
	 * Lista de poderes del personaje.
	 */
	private List<Poder>	poderes;

	/**
	 * Obtiene el ruta.
	 * 
	 * @return ruta.
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * Establece el ruta
	 * 
	 * @param ruta
	 *            establece ruta a ruta
	 * @return el objeto
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**
	 * Obtiene el poderes.
	 * 
	 * @return poderes.
	 */
	public List<Poder> getPoderes() {
		return poderes;
	}

	/**
	 * Establece el poderes
	 * 
	 * @param poderes
	 *            establece poderes a poderes
	 * @return el objeto
	 */
	public void setPoderes(List<Poder> poderes) {
		this.poderes = poderes;
	}

}
