package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

/**
 * Clase descriptora de la Partida (o campaña) como concepto de grupo de escenas que
 * componen una unidad y cuya duración normalmente abarca varios días, semanas o meses.
 * 
 * @author Javi Montes
 *
 */
public class Partida {
	
	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * Nombre
	 */
	private String nombre;
	
	/**
	 * Lista de escenas
	 */
	private List<Escena> listaEscenas;

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
	 * Obtiene el listaEscenas.
	 * @return listaEscenas.
	 */
	public List<Escena> getListaEscenas() {
		return listaEscenas;
	}

	/**
	 * Establece el  listaEscenas
	 * @param listaEscenas establece listaEscenas a listaEscenas
	 * @return el objeto
	 */
	public void setListaEscenas(List<Escena> listaEscenas) {
		this.listaEscenas = listaEscenas;
	}
	

}
