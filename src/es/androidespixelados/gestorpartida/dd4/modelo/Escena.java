package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.Imagen;
import es.androidespixelados.gestorpartida.modelo.ModeloBase;
import es.androidespixelados.gestorpartida.modelo.Trama;

/**
 * Las escenas representan, de forma más o menos aproximada, un conjunto homogeneo de encuentros,
 * situaciones y descripciones comunes durante un espacio de tiempo, Podría utilizarse como analogía
 * el concepto de partida diaria dentro de una campaña general, aunque su tiempo de juego no siempre
 * se circunscribe al día.
 * 
 * Como elementos destacados se incluyen las tramas asociadas, lista de encuentros y lista de personajes 
 * que intervienen, tanto jugadores como no jugadores.
 * 
 * @author Javi Montes
 *
 */
public class Escena extends ModeloBase {
	
	/**
	 * Tramas asociadas a la escena
	 */
	private List<Trama> tramas;
		
	/**
	 * Lista de encuentros que incluye la escena
	 */
	private List<EncuentroDungeons> encuentros;
	
	/**
	 * Lista de personajes que incluye la escena
	 */
	private List<PersonajeDungeons> personajes;
	
	/**
	 * Lista de imágenes que incluye la escena
	 */
	private List<Imagen> imagenes;

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
	 * Obtiene el encuentros.
	 * @return encuentros.
	 */
	public List<EncuentroDungeons> getEncuentros() {
		return encuentros;
	}

	/**
	 * Establece el  encuentros
	 * @param encuentros establece encuentros a encuentros
	 * @return el objeto
	 */
	public void setEncuentros(List<EncuentroDungeons> encuentros) {
		this.encuentros = encuentros;
	}

	/**
	 * Obtiene el personajes.
	 * @return personajes.
	 */
	public List<PersonajeDungeons> getPersonajes() {
		return personajes;
	}

	/**
	 * Establece el  personajes
	 * @param personajes establece personajes a personajes
	 * @return el objeto
	 */
	public void setPersonajes(List<PersonajeDungeons> personajes) {
		this.personajes = personajes;
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
	
}
