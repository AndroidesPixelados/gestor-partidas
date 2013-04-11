package es.androidespixelados.gestorpartida.modelo;

import java.util.List;

/**
 * Clase descriptora de las imágenes que se utilizarán,
 * posteriormente, en la librería tanto general como particular 
 * de cada escena
 * 
 * @author Javi
 *
 */
public class Imagen {
	
	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * Nombre de la imagen
	 */
	private String nombre;
	
	/**
	 * Ruta donde se encuentra almacenada la imagen
	 */
	private String ruta;

	/**
	 * Obtiene el id.
	 * @return id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establece el  id
	 * @param id establece id a id
	 * @return el objeto
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre.
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el  nombre
	 * @param nombre establece nombre a nombre
	 * @return el objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el ruta.
	 * @return ruta.
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * Establece el  ruta
	 * @param ruta establece ruta a ruta
	 * @return el objeto
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	

}
