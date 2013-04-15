package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.Raza;

/**
 * Clase descriptora de personaje para el sistema de reglas D&D4.
 * 
 * @author Javi Montes
 *
 */
public class PersonajeJugador extends PersonajeDungeons {
	
	/**
	 * Clase de personaje
	 */
	private List<ClasePersonaje> clases;
	
	/**
	 * Raza del personaje (Elfo, humano...etc)
	 */
	private Raza raza;
	
	/**
	 * Obtiene el clases.
	 * @return clases.
	 */
	public List<ClasePersonaje> getClases() {
		return clases;
	}

	/**
	 * Establece el  clases
	 * @param clases establece clases a clases
	 * @return el objeto
	 */
	public void setClases(List<ClasePersonaje> clases) {
		this.clases = clases;
	}

	/**
	 * Obtiene el raza.
	 * @return raza.
	 */
	public Raza getRaza() {
		return raza;
	}

	/**
	 * Establece el  raza
	 * @param raza establece raza a raza
	 * @return el objeto
	 */
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
}
