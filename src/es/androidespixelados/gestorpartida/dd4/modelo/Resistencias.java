package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 * Enumerador de las diferentes resistencias que puede tener
 * un actor
 * 
 * @author Javi Montes
 *
 */
public enum Resistencias {
	
	/** Resistencia al frío **/
	FRIO(1),
	
	/** Resistencia al calor **/
	CALOR(2),
	
	/** Resistencia al daño radiante **/
	RADIANTE(3);
	
	/** Valor del enumerador **/
	private int valor;
	
	Resistencias(int valor) {
		
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
