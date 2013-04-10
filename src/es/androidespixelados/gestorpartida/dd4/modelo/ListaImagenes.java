/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.*;

/**
 * @author Javi Montes
 *
 */
public class ListaImagenes {
	
	/**
	 * @ID
	 */
	private Long id;
	
	/**
	 * @Nombre de la lista
	 */
	private String nombreLista;
	
	/**
	 * @Lista de Imágenes
	 */
	private List<Imagen> listaImagenes;

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
	 * Obtiene el nombreLista.
	 * @return nombreLista.
	 */
	public String getNombreLista() {
		return nombreLista;
	}

	/**
	 * Establece el  nombreLista
	 * @param nombreLista establece nombreLista a nombreLista
	 * @return el objeto
	 */
	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	/**
	 * Obtiene el listaImagenes.
	 * @return listaImagenes.
	 */
	public List<Imagen> getListaImagenes() {
		return listaImagenes;
	}

	/**
	 * Establece el  listaImagenes
	 * @param listaImagenes establece listaImagenes a listaImagenes
	 * @return el objeto
	 */
	public void setListaImagenes(List<Imagen> listaImagenes) {
		this.listaImagenes = listaImagenes;
	}

}
