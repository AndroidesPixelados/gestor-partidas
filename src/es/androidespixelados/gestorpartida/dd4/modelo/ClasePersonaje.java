package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 *
 * Clase descriptora de los diferentes tipos de personaje: guerrero, paladín,
 * pícaro...etc.
 * 
 * @author Javi Montes
 *
 */
public class ClasePersonaje {
	
	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * Nombre
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
