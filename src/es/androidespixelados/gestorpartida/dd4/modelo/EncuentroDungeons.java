package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.Encuentro;

/**
 * Subclase específica de un encuentro diseñado para el
 * sistema de reglas de D&D4
 * 
 * @author Javi Montes
 *
 */
public class EncuentroDungeons extends Encuentro{
	
	/**
	 * Lista de enemigos
	 */
	private List<Monstruo> enemigos;

	/**
	 * Obtiene el enemigos.
	 * @return enemigos.
	 */
	public List<Monstruo> getEnemigos() {
		return enemigos;
	}
	
	/**
	 * Establece el  enemigos
	 * @param enemigos establece enemigos a enemigos
	 * @return el objeto
	 */
	public void setEnemigos(List<Monstruo> enemigos) {
		this.enemigos = enemigos;
	}


}
