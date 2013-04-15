/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * Cada uno de los monstruos de D&D4 tiene un rol asignado en combate. Éste puede ser
 * de diferente tipo: artillería, bruto, controlador....etc. Además, aquellos pueden
 * tener rango élite o líder, potenciando sus características.
 * 
 * @author Javi Montes
 *
 */
public class Rol extends ModeloBase {
	
	/**
	 * Marcador de élite
	 */
	private boolean elite;
	
	/**
	 * Marcador de líder
	 */
	private boolean lider;

	/**
	 * Obtiene el elite.
	 * @return elite.
	 */
	public boolean isElite() {
		return elite;
	}

	/**
	 * Establece el  elite
	 * @param elite establece elite a elite
	 * @return el objeto
	 */
	public void setElite(boolean elite) {
		this.elite = elite;
	}

	/**
	 * Obtiene el lider.
	 * @return lider.
	 */
	public boolean isLider() {
		return lider;
	}

	/**
	 * Establece el  lider
	 * @param lider establece lider a lider
	 * @return el objeto
	 */
	public void setLider(boolean lider) {
		this.lider = lider;
	}
	

}
