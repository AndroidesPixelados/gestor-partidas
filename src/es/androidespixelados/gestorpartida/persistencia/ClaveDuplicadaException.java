/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

/**
 * Una excepción lanzada cuando los ficheros de consultas yaml contienen claves duplicadas.
 * 
 * @author Loïc Prieto.
 * 
 */
public class ClaveDuplicadaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -3203634579923265186L;

	/**
	 * La clave duplicada.
	 */
	private String				claveDuplicada;

	/**
	 * El nombre del fichero en el que se ha detectado la clave duplicada.
	 */
	private String				nombreFichero;

	/**
	 * Constructor.
	 */
	public ClaveDuplicadaException(String claveDuplicada, String nombreFichero, String mensaje) {
		super(mensaje);
		this.claveDuplicada = claveDuplicada;
		this.nombreFichero = nombreFichero;
	}

	/**
	 * Obtiene el claveDuplicada.
	 * 
	 * @return claveDuplicada.
	 */
	public String getClaveDuplicada() {
		return claveDuplicada;
	}

	/**
	 * Establece el claveDuplicada
	 * 
	 * @param claveDuplicada
	 *            establece claveDuplicada a claveDuplicada
	 * @return el objeto
	 */
	public void setClaveDuplicada(String claveDuplicada) {
		this.claveDuplicada = claveDuplicada;
	}

	/**
	 * Obtiene el nombreFichero.
	 * 
	 * @return nombreFichero.
	 */
	public String getNombreFichero() {
		return nombreFichero;
	}

	/**
	 * Establece el nombreFichero
	 * 
	 * @param nombreFichero
	 *            establece nombreFichero a nombreFichero
	 * @return el objeto
	 */
	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

}
