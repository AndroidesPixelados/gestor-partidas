package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.List;
import java.util.Map;

import es.androidespixelados.gestorpartida.modelo.Trama;


public class Personaje extends ModeloBase {

	/**
	 * El tipo del personaje.
	 */
	private TipoPersonaje			tipo;

	/**
	 * El listado de atributos. La clave del mapa es el nombre del atributo.
	 */
	private Map<String, Atributo>	atributos;

	/**
	 * La lista de tramas asociadas al personaje.
	 * Este atributo es dependiente del contexto en el que se mire al personaje.
	 */
	private List<Trama>				tramas;

	/**
	 * Una lista de imágenes asociadas al personaje.
	 */
	private List<Imagen>			imagenes;

	/**
	 * @return the tipo
	 */
	public TipoPersonaje getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(TipoPersonaje tipo) {
		this.tipo = tipo;
	}

	/**
	 * Obtiene el tramas.
	 * 
	 * @return tramas
	 */
	public List<Trama> getTramas() {
		return tramas;
	}

	/**
	 * Establece el valor de tramas al valor de tramas.
	 * 
	 * @param tramas
	 *            el valor a establecer
	 */
	public void setTramas(List<Trama> tramas) {
		this.tramas = tramas;
	}

	/**
	 * Obtiene el imagenes.
	 * 
	 * @return imagenes
	 */
	public List<Imagen> getImagenes() {
		return imagenes;
	}

	/**
	 * Establece el valor de imagenes al valor de imagenes.
	 * 
	 * @param imagenes
	 *            el valor a establecer
	 */
	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}

	/**
	 * Obtiene el atributos.
	 * 
	 * @return atributos
	 */
	public Map<String, Atributo> getAtributos() {
		return atributos;
	}

	/**
	 * Establece el valor de atributos al valor de atributos.
	 * 
	 * @param atributos
	 *            el valor a establecer
	 */
	public void setAtributos(Map<String, Atributo> atributos) {
		this.atributos = atributos;
	}
}
