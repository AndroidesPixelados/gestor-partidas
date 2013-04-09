/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo;

/**
 * La abstracción de un recurso multimedia, ya sea una imagen o
 * una canción.
 * 
 * @author Loïc Prieto
 * 
 */
public class RecursoMultimedia extends ModeloBase {
	/**
	 * La URL del recurso, partiendo de la carpeta de la aplicación.
	 */
	private String	url;

	/**
	 * Obtiene el url.
	 * 
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Establece el valor de url al valor de url.
	 * 
	 * @param url
	 *            el valor a establecer
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
