/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.ModeloBase;
import es.androidespixelados.gestorpartida.modelo.RecursoMultimedia;

/**
 * Abstracción de una lista de recursos multimedia.
 * Sirve de base para la lista de reproducción de música
 * o el álbum de imágenes.
 * 
 * @author Loïc Prieto
 * 
 */
public class ColeccionRecursos extends ModeloBase {
	/**
	 * La lista de recursos.
	 */
	private List<? extends RecursoMultimedia>	recursos;

	/**
	 * Obtiene el recursos.
	 * 
	 * @return recursos
	 */
	public List<? extends RecursoMultimedia> getRecursos() {
		return recursos;
	}

	/**
	 * Establece el valor de recursos al valor de recursos.
	 * 
	 * @param recursos
	 *            el valor a establecer
	 */
	public void setRecursos(List<? extends RecursoMultimedia> recursos) {
		this.recursos = recursos;
	}

}
