package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 * 
 * @author Javi Montes
 *
 */
public class Jugador extends Personaje {
	
	/**
	 * Clase de personaje
	 */
	private ClasePersonaje clase;

	/**
	 * Obtiene el clase.
	 * @return clase.
	 */
	public ClasePersonaje getClase() {
		return clase;
	}

	/**
	 * Establece el  clase
	 * @param clase establece clase a clase
	 * @return el objeto
	 */
	public void setClase(ClasePersonaje clase) {
		this.clase = clase;
	}
	

}
