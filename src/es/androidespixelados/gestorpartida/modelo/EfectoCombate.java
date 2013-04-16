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
	private Imagen icono;

	/**
	 * Obtiene el icono.
	 * @return icono.
	 */
	public Imagen getIcono() {
		return icono;
	}

	/**
	 * Establece el  icono
	 * @param icono establece icono a icono
	 * @return el objeto
	 */
	public void setIcono(Imagen icono) {
		this.icono = icono;
	}
	
	

}
