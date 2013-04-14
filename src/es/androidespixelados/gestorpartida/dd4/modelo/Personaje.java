package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;
import java.util.Map;

import es.androidespixelados.gestorpartida.modelo.EfectoCombate;

/**
 * Esta clase engloba la descripción de actores jugadores y no-jugadores. Además, sirve de clase padre
 * para Monstruo, la cual hereda todos sus atributos.
 * 
 * @author Javi Montes
 * 
 */
public class Personaje {

	/**
	 * ID
	 */
	private Long				id;

	/**
	 * nombre
	 */

	private String				nombre;

	/**
	 * nivel
	 */
	private int					nivel;

	/**
	 * Puntos de vida
	 */
	private int					puntosVida;

	/**
	 * Estado de bloodied
	 */
	private boolean				bloodied;

	/**
	 * AC (clase de armadura)
	 */
	private int					ac;

	/**
	 * Iniciativa
	 */
	private int					iniciativa;

	/**
	 * Ruta donde se encuentra almacenado el archivo
	 */
	private String				ruta;

	/**
	 * Resistencias (Fortaleza, Reflejos y Voluntad)
	 */
	private Map<String, Object>	resistencias;

	/**
	 * Lista de efectos sufridos en combate
	 */
	private List<EfectoCombate>	efectosSufridosEnCombate;

	/**
	 * Obtiene el id.
	 * 
	 * @return id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establece el id
	 * 
	 * @param id
	 *            establece id a id
	 * @return el objeto
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre.
	 * 
	 * @return nombre.
	 */
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

	/**
	 * Obtiene el nivel.
	 * 
	 * @return nivel.
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Establece el nivel
	 * 
	 * @param nivel
	 *            establece nivel a nivel
	 * @return el objeto
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * Obtiene el puntosVida.
	 * 
	 * @return puntosVida.
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * Establece el puntosVida
	 * 
	 * @param puntosVida
	 *            establece puntosVida a puntosVida
	 * @return el objeto
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	/**
	 * Obtiene el bloodied.
	 * 
	 * @return bloodied.
	 */
	public boolean isBloodied() {
		return bloodied;
	}

	/**
	 * Establece el bloodied
	 * 
	 * @param bloodied
	 *            establece bloodied a bloodied
	 * @return el objeto
	 */
	public void setBloodied(boolean bloodied) {
		this.bloodied = bloodied;
	}

	/**
	 * Obtiene el ac.
	 * 
	 * @return ac.
	 */
	public int getAc() {
		return ac;
	}

	/**
	 * Establece el ac
	 * 
	 * @param ac
	 *            establece ac a ac
	 * @return el objeto
	 */
	public void setAc(int ac) {
		this.ac = ac;
	}

	/**
	 * Obtiene el iniciativa.
	 * 
	 * @return iniciativa.
	 */
	public int getIniciativa() {
		return iniciativa;
	}

	/**
	 * Establece el iniciativa
	 * 
	 * @param iniciativa
	 *            establece iniciativa a iniciativa
	 * @return el objeto
	 */
	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	/**
	 * Obtiene el ruta.
	 * 
	 * @return ruta.
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * Establece el ruta
	 * 
	 * @param ruta
	 *            establece ruta a ruta
	 * @return el objeto
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**
	 * Obtiene el resistencias.
	 * 
	 * @return resistencias.
	 */
	public Map<String, Object> getResistencias() {
		return resistencias;
	}

	/**
	 * Establece el resistencias
	 * 
	 * @param resistencias
	 *            establece resistencias a resistencias
	 * @return el objeto
	 */
	public void setResistencias(Map<String, Object> resistencias) {
		this.resistencias = resistencias;
	}

	/**
	 * Obtiene el efectosSufridosEnCombate.
	 * 
	 * @return efectosSufridosEnCombate.
	 */
	public List<EfectoCombate> getEfectosSufridosEnCombate() {
		return efectosSufridosEnCombate;
	}

	/**
	 * Establece el efectosSufridosEnCombate
	 * 
	 * @param efectosSufridosEnCombate
	 *            establece efectosSufridosEnCombate a efectosSufridosEnCombate
	 * @return el objeto
	 */
	public void setEfectosSufridosEnCombate(List<EfectoCombate> efectosSufridosEnCombate) {
		this.efectosSufridosEnCombate = efectosSufridosEnCombate;
	}

}
