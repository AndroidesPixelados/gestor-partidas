/**
 * 
 */
package es.androidespixelados.gestorpartida.modelo;

import java.util.List;

/**
 * El sistema jugable de una partida.
 * Contiene el conjunto de atributos definidos para los personajes, los módulos que los afectan, y los tipos de
 * encuentro predefinidos. Estos dos últimos está todavía pendiente de ver si incluirlos en la clase sistema,
 * o en alguna subclase a definir para cada sistema.
 * 
 * @author Loïc Prieto
 */
public class Sistema extends ModeloBase {
	/**
	 * Un listado de tipos de atributos disponibles en el sistema.
	 */
	private List<TipoAtributo>	atributos;

	/**
	 * Obtiene el atributos.
	 * 
	 * @return atributos
	 */
	public List<TipoAtributo> getAtributos() {
		return atributos;
	}

	/**
	 * Establece el valor de atributos al valor de atributos.
	 * 
	 * @param atributos
	 *            el valor a establecer
	 */
	public void setAtributos(List<TipoAtributo> atributos) {
		this.atributos = atributos;
	}

}
