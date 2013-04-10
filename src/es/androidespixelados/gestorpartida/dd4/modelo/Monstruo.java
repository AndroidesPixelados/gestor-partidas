package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 * Esta clase engloba la descripción de monstruos utilizados en encuentros. Hereda de
 * Personaje ya que tienen múltiples atributos en común 
 * 
 * @author Javi Montes
 *
 */
public class Monstruo extends Personaje {
	
	
	
	/**
	 * @Rol principal de la criatura (artillería, controlador...etc)
	 */
	private Rol rol;
	
	/**
	 * @estaMuerto booleano que marca si un monstruo está muerto o no
	 */
	private boolean estaMuerto;

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
	 * Obtiene el estaMuerto.
	 * @return estaMuerto.
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	/**
	 * Establece el  estaMuerto
	 * @param estaMuerto establece estaMuerto a estaMuerto
	 * @return el objeto
	 */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

}
