package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

/**
 * Las escenas representan, de forma más o menos aproximada, un conjunto homogeneo de encuentros,
 * situaciones y descripciones comunes durante un espacio de tiempo, Podría utilizarse como analogía
 * el concepto de partida diaria dentro de una campaña general, aunque su tiempo de juego no siempre
 * se circunscribe al día.
 * 
 * Como elementos destacados se incluye su descripción, lista de encuentros y lista de personajes que
 * intervienen, tanto jugadores como no jugadores.
 * 
 * @author Javi Montes
 *
 */
public class Escena {
	
	/**
	 * ID de la escena
	 */
	private Long id;
	
	/**
	 * Nombre de la escena
	 */
	private String nombre;
	
	/**
	 * Descripción de la escena
	 */
	private String descripcion;
	
	
	/**
	 * Lista de encuentros que incluye la escena
	 */
	private List<Encuentro> listaEncuentrosEscena;
	
	/**
	 * Lista de personajes que incluye la escena
	 */
	private List<Personaje> listaPersonajesEscena;

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
	 * Obtiene el listaEncuentrosEscena.
	 * @return listaEncuentrosEscena.
	 */
	public List<Encuentro> getListaEncuentrosEscena() {
		return listaEncuentrosEscena;
	}

	/**
	 * Establece el  listaEncuentrosEscena
	 * @param listaEncuentrosEscena establece listaEncuentrosEscena a listaEncuentrosEscena
	 * @return el objeto
	 */
	public void setListaEncuentrosEscena(List<Encuentro> listaEncuentrosEscena) {
		this.listaEncuentrosEscena = listaEncuentrosEscena;
	}

	/**
	 * Obtiene el listaPersonajesEscena.
	 * @return listaPersonajesEscena.
	 */
	public List<Personaje> getListaPersonajesEscena() {
		return listaPersonajesEscena;
	}

	/**
	 * Establece el  listaPersonajesEscena
	 * @param listaPersonajesEscena establece listaPersonajesEscena a listaPersonajesEscena
	 * @return el objeto
	 */
	public void setListaPersonajesEscena(List<Personaje> listaPersonajesEscena) {
		this.listaPersonajesEscena = listaPersonajesEscena;
	}


}
