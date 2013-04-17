package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 * Enumerador de las diferentes clases de personaje.
 * Por ejemplo: clérigo, pícaro, guerrero...etc
 * 
 * @author Javi Montes
 *
 */
public enum ClasePersonaje {
	
	/** Clase Clérigo **/
	CLERIGO(1),
	
	/** Clase Guerrero **/
	GUERRERO(2),
	
	/** Clase Paladín **/
	PALADIN(3),
	
	/** Clase Mago **/
	MAGO(4),
	
	/** Pícaro **/
	PICARO(5);
	
	/** Valor del Enumerador **/
	private int valor;


	ClasePersonaje(int valor) {
		
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
