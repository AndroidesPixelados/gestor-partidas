package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

/**
 * Clase descriptora de personajes no jugadores (NPC).
 * 
 * @author Javi Montes
 *
 */
public class PersonajeNoJugador extends PersonajeJugador {
	
	/**
	 * Lista de habilidades (necesaria para chequeos de habilidad)
	 */
	private List<Habilidad> listaDeHabilidades;

	/**
	 * Obtiene el listaDeHabilidades.
	 * @return listaDeHabilidades.
	 */
	public List<Habilidad> getListaDeHabilidades() {
		return listaDeHabilidades;
	}

	/**
	 * Establece el  listaDeHabilidades
	 * @param listaDeHabilidades establece listaDeHabilidades a listaDeHabilidades
	 * @return el objeto
	 */
	public void setListaDeHabilidades(List<Habilidad> listaDeHabilidades) {
		this.listaDeHabilidades = listaDeHabilidades;
	}

}
