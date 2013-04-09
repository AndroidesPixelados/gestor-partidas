package es.androidespixelados.gestorpartida.anima.modelo;

/**
 * Un texto narrativo para asociado a una partida, una escena, un encuentro o un personaje.
 * 
 * @author Loïc Prieto
 * 
 */
public class Trama extends ModeloBase {
	/**
	 * El texto de la trama.
	 */
	private String	texto;

	/**
	 * Obtiene el texto.
	 * 
	 * @return texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Establece el valor de texto al valor de texto.
	 * 
	 * @param texto
	 *            el valor a establecer
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
