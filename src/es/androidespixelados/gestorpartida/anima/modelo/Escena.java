package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.anima.modelo.encuentros.Encuentro;
import es.androidespixelados.gestorpartida.modelo.ModeloBase;
import es.androidespixelados.gestorpartida.modelo.Personaje;
import es.androidespixelados.gestorpartida.modelo.Trama;

public class Escena extends ModeloBase {

	/**
	 * La lista de personajes de la escena.
	 */
	private List<Personaje>			personajes;

	/**
	 * La lista de tramas asociadas a la escena.
	 */
	private List<Trama>				tramas;

	/**
	 * La lista de álbumes de imágenes asociados a la escena.
	 */
	private List<ColeccionRecursos>	albumes;
	/**
	 * La lista de listas de reproducción de música asociadas a la escena.
	 */
	private List<ColeccionRecursos>	listasReproduccion;

	/**
	 * La lista de encuentros asociados a la escena.
	 */
	private List<Encuentro>			encuentros;

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
	 * Obtiene el tramas.
	 * 
	 * @return tramas
	 */
	public List<Trama> getTramas() {
		return tramas;
	}

	/**
	 * Establece el valor de tramas al valor de tramas.
	 * 
	 * @param tramas
	 *            el valor a establecer
	 */
	public void setTramas(List<Trama> tramas) {
		this.tramas = tramas;
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

	/**
	 * Obtiene el encuentros.
	 * 
	 * @return encuentros
	 */
	public List<Encuentro> getEncuentros() {
		return encuentros;
	}

	/**
	 * Establece el valor de encuentros al valor de encuentros.
	 * 
	 * @param encuentros
	 *            el valor a establecer
	 */
	public void setEncuentros(List<Encuentro> encuentros) {
		this.encuentros = encuentros;
	}

}
