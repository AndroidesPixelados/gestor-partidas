package es.androidespixelados.gestorpartida.modelo;

import java.util.List;
import java.util.Map;

/**
 * Un personaje en abstracto es una colección de atributos, imágenes y tramas asociadas.
 * Cada sistema necesitará implementar su propio tipo de personaje derivado de este si
 * quiere aportarle más funcionalidad.
 * 
 * @author Loïc Prieto
 * 
 */
public class Personaje extends ModeloBase {

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
	 * Lista de efectos sufridos en combate
	 */
	private List<EfectoCombate>	efectosSufridosEnCombate;

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

	/**
	 * Obtiene el efectosSufridosEnCombate.
	 * 
	 * @return efectosSufridosEnCombate.
	 */
	public List<EfectoCombate> getEfectosSufridosEnCombate() {
		return efectosSufridosEnCombate;
	}

	/**
	 * Establece el  efectosSufridosEnCombate
	 * @param efectosSufridosEnCombate
	 * @return el objeto
	 */
	public void setEfectosSufridosEnCombate(List<EfectoCombate> efectosSufridosEnCombate) {
		this.efectosSufridosEnCombate = efectosSufridosEnCombate;
	}
	
}
