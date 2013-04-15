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
public class Encuentro extends ModeloBase{
	
	/**
	 * Lista de tramas
	 */
	private List<Trama> tramas;
	
	/**
	 * Lista de imágenes
	 */
	private List<Imagen> imagenes;
	
	/**
	 * Lista de canciones (ambiente)
	 */
	private List<Sonido> musica;

	/**
	 * Obtiene el tramas.
	 * @return tramas.
	 */
	public List<Trama> getTramas() {
		return tramas;
	}

	/**
	 * Establece el  tramas
	 * @param tramas establece tramas a tramas
	 * @return el objeto
	 */
	public void setTramas(List<Trama> tramas) {
		this.tramas = tramas;
	}

	/**
	 * Obtiene el imagenes.
	 * @return imagenes.
	 */
	public List<Imagen> getImagenes() {
		return imagenes;
	}

	/**
	 * Establece el  imagenes
	 * @param imagenes establece imagenes a imagenes
	 * @return el objeto
	 */
	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}

	/**
	 * Obtiene el musica.
	 * @return musica.
	 */
	public List<Sonido> getMusica() {
		return musica;
	}

	/**
	 * Establece el  musica
	 * @param musica establece musica a musica
	 * @return el objeto
	 */
	public void setMusica(List<Sonido> musica) {
		this.musica = musica;
	}

}
