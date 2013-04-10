package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

/**
 * Esta clase corresponde con una lista de reproducción. Cada una de ellas tendrá un nombre asociado
 * y contendrá una lista de archivos de audio
 * 
 * @author Javi Montes
 *
 */
public class ListaMusica {
	
	/**
	 * @ID
	 */
	private Long id;
	
	/**
	 * @Nombre de la lista
	 */
	private String nombreLista;
	
	/**
	 * @Lista de archivos
	 */
	private List<ArchivoSonido> listaArchivos;

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
	 * Obtiene el listaArchivos.
	 * @return listaArchivos.
	 */
	public List<ArchivoSonido> getListaArchivos() {
		return listaArchivos;
	}

	/**
	 * Establece el  listaArchivos
	 * @param listaArchivos establece listaArchivos a listaArchivos
	 * @return el objeto
	 */
	public void setListaArchivos(List<ArchivoSonido> listaArchivos) {
		this.listaArchivos = listaArchivos;
	}

}
