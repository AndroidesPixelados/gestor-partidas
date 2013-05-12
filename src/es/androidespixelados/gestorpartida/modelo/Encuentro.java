/**
 *
 */
package es.androidespixelados.gestorpartida.modelo;

import java.util.List;

/**
 * Clase genérica descriptora de un encuentro. Éste se refiere a una situación,
 * con interactividad directa por parte de los jugadores, generalmente mediante
 * combate o chequeos de habilidad.
 * 
 * @author Javi Montes
 * 
 */
public class Encuentro extends ModeloBase {

	/**
	 * Lista de tramas
	 */
	private List<Trama>				tramas;

	/**
	 * Lista de imágenes
	 */
	private List<RecursoMultimedia>	imagenes;

	/**
	 * Lista de canciones (ambiente)
	 */
	private List<RecursoMultimedia>	musica;

	/**
	 * El listado de personajes que participan en el encuentro.
	 */
	private List<Personaje>			personajes;

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
	 * Obtiene el imagenes.
	 * 
	 * @return imagenes.
	 */
	public List<RecursoMultimedia> getImagenes() {
		return imagenes;
	}

	/**
	 * Establece el imagenes
	 * 
	 * @param imagenes
	 *            establece imagenes a imagenes
	 * @return el objeto
	 */
	public void setImagenes(List<RecursoMultimedia> imagenes) {
		this.imagenes = imagenes;
	}

	/**
	 * Obtiene el musica.
	 * 
	 * @return musica.
	 */
	public List<RecursoMultimedia> getMusica() {
		return musica;
	}

	/**
	 * Establece el musica
	 * 
	 * @param musica
	 *            establece musica a musica
	 * @return el objeto
	 */
	public void setMusica(List<RecursoMultimedia> musica) {
		this.musica = musica;
	}

	/**
	 * Obtiene el personajes.
	 * 
	 * @return personajes.
	 */
	public List<Personaje> getPersonajes() {
		return personajes;
	}

	/**
	 * Establece el personajes
	 * 
	 * @param personajes
	 *            establece personajes a personajes
	 * @return el objeto
	 */
	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

}
