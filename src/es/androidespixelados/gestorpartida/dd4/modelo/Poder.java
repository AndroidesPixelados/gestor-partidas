/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * Un poder es una habilidad que tiene un personaje, que ejecuta sobre si mismo o sobre otros.
 * 
 * @author Loïc Prieto.
 * 
 */
public class Poder extends ModeloBase {

	boolean bloodied;
	int valorRecarga;
	enum frecuenciaUso;
	int turnoActivacion;
	
	/**
	 * La descripción del poder
	 */
	private String	descripcion;

	/**
	 * Obtiene el descripcion.
	 * 
	 * @return descripcion.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Establece el descripcion
	 * 
	 * @param descripcion
	 *            establece descripcion a descripcion
	 * @return el objeto
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
