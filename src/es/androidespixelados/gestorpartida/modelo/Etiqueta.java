package es.androidespixelados.gestorpartida.modelo;

/**
 * 
 * Clase descriptora de las etiquetas (tags) aplicables a los distintos archivos de sonido e imagen.
 * 
 * @author Javi Montes
 *
 */
public class Etiqueta {
	
	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * nombre
	 */
	private String nombre;

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


}
