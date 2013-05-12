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
	 * El listado de atributos. La clave del mapa es el nombre del tipo de atributo.
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
	private List<RecursoMultimedia>	imagenes;

	/**
	 * Lista de efectos sufridos en combate
	 */
	private List<EfectoCombate>		efectosSufridosEnCombate;

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
	 * @return imagenes.
	 */
	public List<RecursoMultimedia> getImagenes() {
		return imagenes;
	}

	/**
	 * Establece el imagenes
	 * 
	 * @param imagenes
	 *            establece imagenes a imagenes
	 * @return el objeto
	 */
	public void setImagenes(List<RecursoMultimedia> imagenes) {
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
	 * Obtiene el valor de un atributo, identificado por el nombre
	 * del tipo de atributo.
	 * 
	 * @param nombreAtributo
	 *            el nombre del tipo de atributo
	 * @return
	 */
	public Object getAtributo(EnumeracionTipoAtributo nombreTipoAtributo) {
		return this.getAtributo(nombreTipoAtributo.getNombre());
	}

	/**
	 * Obtiene el valor de un atributo, identificado por el nombre
	 * del tipo de atributo.
	 * 
	 * @param nombreAtributo
	 *            el nombre del tipo de atributo
	 * @return
	 */
	public Object getAtributo(String nombreTipoAtributo) {
		Object resultado = null;
		Atributo atributo = atributos.get(nombreTipoAtributo);
		if (atributo != null) {
			resultado = atributo.getValor();
		}
		return resultado;
	}

	/**
	 * Obtiene el valor de un atributo, convertido al tipo de datos especificado.
	 * 
	 * @param nombreTipoAtributo
	 * @param tipoTipoAtributo
	 * @return
	 */
	public <T> T getAtributo(String nombreTipoAtributo, Class<T> tipoTipoAtributo) {
		Object valorAtributo = getAtributo(nombreTipoAtributo);

		return tipoTipoAtributo.cast(valorAtributo);
	}

	/**
	 * Obtiene el valor de un atributo, convertido al tipo de datos especificado.
	 * 
	 * @param nombreTipoAtributo
	 * @param tipoTipoAtributo
	 * @return
	 */
	public <T> T getAtributo(EnumeracionTipoAtributo nombreTipoAtributo, Class<T> tipoTipoAtributo) {
		return getAtributo(nombreTipoAtributo.getNombre(), tipoTipoAtributo);
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
	 * @return el objeto
	 */
	public void setEfectosSufridosEnCombate(List<EfectoCombate> efectosSufridosEnCombate) {
		this.efectosSufridosEnCombate = efectosSufridosEnCombate;
	}

}
