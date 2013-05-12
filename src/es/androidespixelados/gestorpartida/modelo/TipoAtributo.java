/**
 * 
 */
package es.androidespixelados.gestorpartida.modelo;

/**
 * El tipo de atributo. Contiene tanto un tipo semántico
 * como sintáctico, y está asociado a un sistema de juego.
 * Ej: Atributo Fuerza tiene como tipo Primario (valor semántico), y Entero (sintáctico).
 * 
 * @author Loïc Prieto
 * 
 */
public class TipoAtributo extends ModeloBase {
	/**
	 * El tipo de atributo semánticamente hablando.
	 */
	private String		semantico;

	/**
	 * El tipo de atributo sintácticamente hablando.
	 */
	private TipoDato	sintactico;

	/**
	 * El sistema de juego al que está asociado el atributo.
	 */
	private Sistema		sistema;

	/**
	 * La descripción del tipo de atributo.
	 */
	private String		descripcion;

	/**
	 * Obtiene el semantico.
	 * 
	 * @return semantico
	 */
	public String getSemantico() {
		return semantico;
	}

	/**
	 * Establece el valor de semantico al valor de semantico.
	 * 
	 * @param semantico
	 *            el valor a establecer
	 */
	public void setSemantico(String semantico) {
		this.semantico = semantico;
	}

	/**
	 * Obtiene el sintactico.
	 * 
	 * @return sintactico
	 */
	public TipoDato getSintactico() {
		return sintactico;
	}

	/**
	 * Establece el valor de sintactico al valor de sintactico.
	 * 
	 * @param sintactico
	 *            el valor a establecer
	 */
	public void setSintactico(TipoDato sintactico) {
		this.sintactico = sintactico;
	}

	/**
	 * Obtiene el sistema.
	 * 
	 * @return sistema.
	 */
	public Sistema getSistema() {
		return sistema;
	}

	/**
	 * Establece el sistema
	 * 
	 * @param sistema
	 *            establece sistema a sistema
	 * @return el objeto
	 */
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
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
