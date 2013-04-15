/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import es.androidespixelados.gestorpartida.modelo.Personaje;

/**
 * Clase genérica de personaje para el sistema D&D4
 * 
 * @author Javi Montes
 *
 */
public class PersonajeDungeons extends Personaje {
	
	/**
	 * Ruta donde se almacena el personaje
	 */
	private String ruta;

	/**
	 * Obtiene el ruta.
	 * @return ruta.
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * Establece el  ruta
	 * @param ruta establece ruta a ruta
	 * @return el objeto
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
