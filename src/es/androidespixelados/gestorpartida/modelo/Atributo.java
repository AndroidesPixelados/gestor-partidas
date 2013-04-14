/**
 * 
 */
package es.androidespixelados.gestorpartida.modelo;


/**
 * Un atributo para un personaje.
 * 
 * @author Loïc Prieto
 * 
 */
public class Atributo extends ModeloBase {
	/**
	 * El tipo del atributo.
	 */
	private TipoAtributo	tipo;

	/**
	 * El valor del atributo;
	 */
	private Object			valor;

	/**
	 * Obtiene el tipo.
	 * 
	 * @return tipo
	 */
	public TipoAtributo getTipo() {
		return tipo;
	}

	/**
	 * Establece el valor de tipo al valor de tipo.
	 * 
	 * @param tipo
	 *            el valor a establecer
	 */
	public void setTipo(TipoAtributo tipo) {
		this.tipo = tipo;
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
