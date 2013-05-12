/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import es.androidespixelados.gestorpartida.modelo.EnumeracionTipoAtributo;

/**
 * Enumeración de nombres de atributos generales de un personaje
 * dungeons.
 * 
 * @author Javi Montes
 * 
 */
public enum AtributosGeneralesDungeons implements EnumeracionTipoAtributo {
	/**
	 * Atributo raza.
	 */
	RAZA("raza");

	/**
	 * El nombre que tendrá el atributo en base de datos
	 */
	private String	nombre;

	/**
	 * 
	 */
	private AtributosGeneralesDungeons(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre
	 * 
	 * @param nombre
	 *            establece nombre a nombre
	 * @return el objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
