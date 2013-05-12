package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.persistencia.EnumUtil;

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
	private List<ClasePersonaje>	clases;

	/**
	 * Obtiene la raza del personaje.
	 * 
	 * @return raza.
	 */
	public RazaDungeons getRaza() {
		Integer raza = this.getAtributo(AtributosGeneralesDungeons.RAZA, Integer.class);

		return EnumUtil.convertirValorPersistenteAEnumeracion(RazaDungeons.class, raza);
	}

	/**
	 * Obtiene el clases.
	 * 
	 * @return clases.
	 */
	public List<ClasePersonaje> getClases() {
		return clases;
	}

	/**
	 * Establece el clases
	 * 
	 * @param clases
	 *            establece clases a clases
	 * @return el objeto
	 */
	public void setClases(List<ClasePersonaje> clases) {
		this.clases = clases;
	}

}
