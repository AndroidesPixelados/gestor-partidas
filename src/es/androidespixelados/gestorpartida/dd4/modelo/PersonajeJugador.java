package es.androidespixelados.gestorpartida.dd4.modelo;

import es.androidespixelados.gestorpartida.persistencia.EnumUtil;

/**
 * Clase descriptora de personaje para el sistema de reglas D&D4.
 * 
 * @author Javi Montes
 * 
 */
public class PersonajeJugador extends PersonajeDungeons {

	/**
	 * Obtiene la raza del personaje.
	 * 
	 * @return raza.
	 */
	public RazaDungeons getRaza() {
		Integer raza = this.getAtributo(AtributosGeneralesDungeons.RAZA, Integer.class);

		return EnumUtil.convertirValorPersistenteAEnumeracion(RazaDungeons.class, raza);
	}

}