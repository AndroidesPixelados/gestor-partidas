/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.anima.modelo.modulos.ModuloPersonaje;
import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * El sistema jugable de una partida.
 * Contiene el conjunto de atributos definidos para los personajes, los módulos que los afectan, y los tipos de
 * encuentro predefinidos.
 * 
 * @author Loïc Prieto
 */
public class Sistema extends ModeloBase {
	/**
	 * La lista de módulos de personaje implementadas en el sistema.
	 */
	private List<ModuloPersonaje>	modulos;

	/**
	 * Un listado de tipos de atributos disponibles en el sistema.
	 */
	private List<TipoAtributo>		atributos;

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

	/**
	 * Obtiene el modulos.
	 * 
	 * @return modulos
	 */
	public List<ModuloPersonaje> getModulos() {
		return modulos;
	}

	/**
	 * Establece el valor de modulos al valor de modulos.
	 * 
	 * @param modulos
	 *            el valor a establecer
	 */
	public void setModulos(List<ModuloPersonaje> modulos) {
		this.modulos = modulos;
	}

}
