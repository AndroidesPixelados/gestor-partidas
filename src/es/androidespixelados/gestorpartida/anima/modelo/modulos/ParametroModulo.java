/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo.modulos;

import es.androidespixelados.gestorpartida.anima.modelo.TipoDato;
import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * Un parámetro de un módulo de personaje.
 * 
 * @author Loïc Prieto
 * 
 */
public class ParametroModulo extends ModeloBase {
	/**
	 * El tipo de dato del parámetro.
	 */
	private TipoDato	tipoDato;

	/**
	 * El valor del parametro.
	 */
	private Object		valor;

	/**
	 * Obtiene el tipoDato.
	 * 
	 * @return tipoDato
	 */
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * Establece el valor de tipoDato al valor de tipoDato.
	 * 
	 * @param tipoDato
	 *            el valor a establecer
	 */
	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}

	/**
	 * Obtiene el valor.
	 * 
	 * @return valor
	 */
	public Object getValor() {
		return valor;
	}

	/**
	 * Establece el valor de valor al valor de valor.
	 * 
	 * @param valor
	 *            el valor a establecer
	 */
	public void setValor(Object valor) {
		this.valor = valor;
	}

}
