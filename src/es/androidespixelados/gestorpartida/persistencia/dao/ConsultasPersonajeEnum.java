/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import es.androidespixelados.gestorpartida.persistencia.EnumConsultaSQL;

/**
 * @author Javi Montes
 * 
 */
public enum ConsultasPersonajeEnum implements EnumConsultaSQL {

	/**
	 * Obtiene todos los sistemas filtrados por nombre.
	 */
	OBTENER_PERSONAJE_POR_ID("obtenerPersonajePorId");

	/**
	 * La clave SQL que está presente en los ficheros yaml.
	 */
	private String	claveSQL;

	private ConsultasPersonajeEnum(String claveSQL) {
		this.claveSQL = claveSQL;
	}

	/**
	 * Obtiene la clave de la consulta SQL.
	 * 
	 * @return clave.
	 */
	@Override
	public String getClaveSQL() {
		return claveSQL;
	}
}
