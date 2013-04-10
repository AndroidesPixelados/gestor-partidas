/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.List;

/**
 * Una partida.
 * Contiene todos los datos registrados para la misma. Puede cachearse para evitar consultas a base de datos.
 * 
 * @author Loïc Prieto
 * 
 */
public class Partida extends ModeloBase {
	/**
	 * El sistema usado para la partida.
	 */
	private Sistema					sistema;

	/**
	 * El listado de escenas de la partida.
	 */
	private List<Escena>			escenas;

	/**
	 * El listado de personajes asociados a la partida en general.
	 */
	private List<Personaje>			personajes;

	/**
	 * El listado de álbumes de imágenes asociados a la partida en general.
	 */
	private List<ColeccionRecursos>	albumes;

	/**
	 * El listado de listas de reproducción de música asociadas a la partida en general.
	 */
	private List<ColeccionRecursos>	listasReproduccion;

	/**
	 * Obtiene el sistema.
	 * 
	 * @return sistema
	 */
	public Sistema getSistema() {
		return sistema;
	}

	/**
	 * Establece el valor de sistema al valor de sistema.
	 * 
	 * @param sistema
	 *            el valor a establecer
	 */
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	/**
	 * Obtiene el escenas.
	 * 
	 * @return escenas
	 */
	public List<Escena> getEscenas() {
		return escenas;
	}

	/**
	 * Establece el valor de escenas al valor de escenas.
	 * 
	 * @param escenas
	 *            el valor a establecer
	 */
	public void setEscenas(List<Escena> escenas) {
		this.escenas = escenas;
	}

	/**
	 * Obtiene el personajes.
	 * 
	 * @return personajes
	 */
	public List<Personaje> getPersonajes() {
		return personajes;
	}

	/**
	 * Establece el valor de personajes al valor de personajes.
	 * 
	 * @param personajes
	 *            el valor a establecer
	 */
	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

	/**
	 * Obtiene el albumes.
	 * 
	 * @return albumes
	 */
	public List<ColeccionRecursos> getAlbumes() {
		return albumes;
	}

	/**
	 * Establece el valor de albumes al valor de albumes.
	 * 
	 * @param albumes
	 *            el valor a establecer
	 */
	public void setAlbumes(List<ColeccionRecursos> albumes) {
		this.albumes = albumes;
	}

	/**
	 * Obtiene el listasReproduccion.
	 * 
	 * @return listasReproduccion
	 */
	public List<ColeccionRecursos> getListasReproduccion() {
		return listasReproduccion;
	}

	/**
	 * Establece el valor de listasReproduccion al valor de listasReproduccion.
	 * 
	 * @param listasReproduccion
	 *            el valor a establecer
	 */
	public void setListasReproduccion(List<ColeccionRecursos> listasReproduccion) {
		this.listasReproduccion = listasReproduccion;
	}

}
