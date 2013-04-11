package es.androidespixelados.gestorpartida.modelo;

/**
 * Durante el combate, cualquier actor puede sufrir diferentes efectos cuyas consecuencias
 * se dejan notar durante uno o varios asaltos. Por ejemplo, cegado, sordo, atontado...etc.
 * Esta clase describe tales efectos y permitirá mostrarlos en la vista mediante el icono
 * correspondiente, de manera que puedan ser vistos rápidamente por el director de juego.
 * 
 * @author Javi Montes
 *
 */
public class EfectoCombate {
	
	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * Nombre del efecto
	 */
	private String nombre;
	
	/**
	 * Descripción del efecto
	 */
	private String descripción;

	/**
	 * Obtiene el id.
	 * return id.
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
	 * Obtiene el descripción.
	 * @return descripción.
	 */
	public String getDescripción() {
		return descripción;
	}

	/**
	 * Establece el  descripción
	 * @param descripción establece descripción a descripción
	 * @return el objeto
	 */
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

}
