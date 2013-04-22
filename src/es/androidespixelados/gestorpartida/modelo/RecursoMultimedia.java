/**
 * 
 */
package es.androidespixelados.gestorpartida.modelo;


/**
 * La abstracción de un recurso multimedia, ya sea una imagen o
 * una canción.
 * 
 * @author Loïc Prieto
 * 
 */
public class RecursoMultimedia extends ModeloBase {
	
	/**
	 * La ruta del recurso, partiendo de la carpeta de la aplicación.
	 */
	private String	ruta;

	/**
	 * Obtiene el ruta.
	 * @return ruta.
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * Establece el  ruta
	 * @param ruta establece ruta a ruta
	 * @return el objeto
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
