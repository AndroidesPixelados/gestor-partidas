package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;
import java.util.Map;

/**
 * Esta clase engloba la descripción de monstruos utilizados en encuentros. Hereda de
 * Personaje ya que tienen múltiples atributos en común 
 * 
 * @author Javi Montes
 *
 */
public class Monstruo extends PersonajeDungeons {
	
	/**
	 * Marcador de solo
	 */
	private boolean solo;
	
	/**
	 * Marcador de élite
	 */
	private boolean elite;
	
	/**
	 * Marcador de líder
	 */
	private boolean lider;
	
	/**
	 * Rol principal de la criatura (artillería, controlador...etc)
	 */
	private Rol rol;
	
	/**
	 * Lista de resistencias (Ej: Miedo 10, Calor 5...etc)
	 */
	private Map<Resistencias, Integer> mapaDeResistencias;
	
	/**
	 * Los monstruos pueden ser resistentes a uno o más efectos
	 * Ej: Miedo, enfermedad...etc.
	 */
	private List<Inmunidades> listaDeInmunidades;

	/**
	 * Obtiene el solo.
	 * @return solo.
	 */
	public boolean isSolo() {
		return solo;
	}

	/**
	 * Establece el  solo
	 * @param solo establece solo a solo
	 * @return el objeto
	 */
	public void setSolo(boolean solo) {
		this.solo = solo;
	}

	/**
	 * Obtiene el elite.
	 * @return elite.
	 */
	public boolean isElite() {
		return elite;
	}

	/**
	 * Establece el  elite
	 * @param elite establece elite a elite
	 * @return el objeto
	 */
	public void setElite(boolean elite) {
		this.elite = elite;
	}

	/**
	 * Obtiene el lider.
	 * @return lider.
	 */
	public boolean isLider() {
		return lider;
	}

	/**
	 * Establece el  lider
	 * @param lider establece lider a lider
	 * @return el objeto
	 */
	public void setLider(boolean lider) {
		this.lider = lider;
	}

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
	 * Obtiene el mapaDeResistencias.
	 * @return mapaDeResistencias.
	 */
	public Map<Resistencias, Integer> getMapaDeResistencias() {
		return mapaDeResistencias;
	}

	/**
	 * Establece el  mapaDeResistencias
	 * @param mapaDeResistencias establece mapaDeResistencias a mapaDeResistencias
	 * @return el objeto
	 */
	public void setMapaDeResistencias(Map<Resistencias, Integer> mapaDeResistencias) {
		this.mapaDeResistencias = mapaDeResistencias;
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
