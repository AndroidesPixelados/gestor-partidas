package es.androidespixelados.gestorpartida.modelo;

/**
 * Durante el combate, cualquier actor puede sufrir diferentes efectos cuyas consecuencias
 * se dejan notar durante uno o varios asaltos. Por ejemplo, cegado, sordo, atontado...etc.
 * Esta clase describe tales efectos y permitirá mostrarlos en la vista mediante el icono
 * correspondiente, de manera que puedan ser vistos rápidamente por el director de juego.
 * 
 * @author Javi Montes
 * 
 */
public class EfectoCombate extends ModeloBase {

	/** Icono asociado **/
	private Imagen	icono;

	/**
	 * La descripción del efecto.
	 */
	private String	descripcion;

	/**
	 * Obtiene el icono.
	 * 
	 * @return icono.
	 */
	public Imagen getIcono() {
		return icono;
	}

	/**
	 * Establece el icono
	 * 
	 * @param icono
	 *            establece icono a icono
	 * @return el objeto
	 */
	public void setIcono(Imagen icono) {
		this.icono = icono;
	}

	/**
	 * Obtiene el descripcion.
	 * 
	 * @return descripcion.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Establece el descripcion
	 * 
	 * @param descripcion
	 *            establece descripcion a descripcion
	 * @return el objeto
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
