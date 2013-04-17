/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 * Enumerador de los diferentes tipos de inmunidad que puede
 * tener un actor
 * 
 * @author Javi Montes
 *
 */
public enum Inmunidades {
	
	/** Inmunidad a miedo **/
	MIEDO(1),
	
	/** Inmunidad a ceguera **/
	CEGUERA(2),
	
	/** Inmunidad a enfermedad **/
	ENFERMEDAD(3);
	
	/** Valor del enumerador **/
	private int valor;
	
	Inmunidades(int valor) {
		
	}

	/**
	 * Obtiene el valor.
	 * @return valor.
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Establece el  valor
	 * @param valor establece valor a valor
	 * @return el objeto
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

}
