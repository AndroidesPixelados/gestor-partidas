package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

/**
 * Esta clase engloba la descripción de monstruos utilizados en encuentros. Hereda de
 * Personaje ya que tienen múltiples atributos en común 
 * 
 * @author Javi Montes
 *
 */
public class Monstruo extends PersonajeDungeons {
	
	/**
	 * Rol principal de la criatura (artillería, controlador...etc)
	 */
	private Rol rol;
	
	/**
	 * Lista de resistencias (Ej: Miedo 10, Calor 5...etc)
	 */
	private List<Resistencias> listaDeResistencias;
	
	/**
	 * Los monstruos pueden ser resistentes a uno o más efectos
	 * Ej: Miedo, enfermedad...etc.
	 */
	private List<Inmunidades> listaDeInmunidades;

	/**
	 * Obtiene el rol.
	 * @return rol.
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * Establece el  rol
	 * @param rol establece rol a rol
	 * @return el objeto
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	/**
	 * Obtiene el listaDeResistencias.
	 * @return listaDeResistencias.
	 */
	public List<Resistencias> getListaDeResistencias() {
		return listaDeResistencias;
	}

	/**
	 * Establece el  listaDeResistencias
	 * @param listaDeResistencias establece listaDeResistencias a listaDeResistencias
	 * @return el objeto
	 */
	public void setListaDeResistencias(List<Resistencias> listaDeResistencias) {
		this.listaDeResistencias = listaDeResistencias;
	}

	/**
	 * Obtiene el listaDeInmunidades.
	 * @return listaDeInmunidades.
	 */
	public List<Inmunidades> getListaDeInmunidades() {
		return listaDeInmunidades;
	}

	/**
	 * Establece el  listaDeInmunidades
	 * @param listaDeInmunidades establece listaDeInmunidades a listaDeInmunidades
	 * @return el objeto
	 */
	public void setListaDeInmunidades(List<Inmunidades> listaDeInmunidades) {
		this.listaDeInmunidades = listaDeInmunidades;
	}

}
