/**
 *
 */
package es.androidespixelados.gestorpartida.anima.modelo;

import es.androidespixelados.gestorpartida.modelo.Personaje;

/**
 * @author Javi Montes
 * 
 */
public class PersonajeAnima extends Personaje {
	/**
	 * El tipo del personaje.
	 */
	private TipoPersonaje	tipo;

	/**
	 * Obtiene el tipo.
	 * 
	 * @return tipo.
	 */
	public TipoPersonaje getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo
	 * 
	 * @param tipo
	 *            establece tipo a tipo
	 * @return el objeto
	 */
	public void setTipo(TipoPersonaje tipo) {
		this.tipo = tipo;
	}

}
