package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

/**
 * 
 * @author Javi Montes
 *
 */
public class Encuentro {
	
	/**
	 * @ID
	 */
	private Long id;
	
	/**
	 * @Nombre
	 */
	private String nombre;
	
	/**
	 * @Descripción
	 */
	private String descripcion;
	
	/**
	 * @Lista de enemigos
	 */
	private List<Personaje> listaEnemigos;
	
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
	 * Obtiene el descripcion.
	 * @return descripcion.
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Establece el  descripcion
	 * @param descripcion establece descripcion a descripcion
	 * @return el objeto
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Obtiene el listaEnemigos.
	 * @return listaEnemigos.
	 */
	public List<Personaje> getListaEnemigos() {
		return listaEnemigos;
	}
	/**
	 * Establece el  listaEnemigos
	 * @param listaEnemigos establece listaEnemigos a listaEnemigos
	 * @return el objeto
	 */
	public void setListaEnemigos(List<Personaje> listaEnemigos) {
		this.listaEnemigos = listaEnemigos;
	}
	

}
