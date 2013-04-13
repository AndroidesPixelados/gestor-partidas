package es.androidespixelados.gestorpartida.anima.modelo.encuentros;

import java.util.List;

import es.androidespixelados.gestorpartida.anima.modelo.ColeccionRecursos;
import es.androidespixelados.gestorpartida.anima.modelo.Personaje;
import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * Un encuentro es una escena de combate en la que se definen los actores que participan en el mismo.
 * 
 * @author Loïc Prieto
 * 
 */
public class Encuentro extends ModeloBase {

	/**
	 * Los actores que participan en el combate.
	 */
	private List<Personaje>			personajes;

	/**
	 * Las listas de reproducción asociadas a este encuentro.
	 */
	private List<ColeccionRecursos>	listasReproduccion;

	/**
	 * Los álbumes asociados a este encuentro.
	 */
	private List<ColeccionRecursos>	albumes;

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
	 * @return the personajes
	 */
	public List<Personaje> getPersonajes() {
		return personajes;
	}

	/**
	 * @param personajes
	 *            the personajes to set
	 */
	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

}
