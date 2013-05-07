/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import es.androidespixelados.gestorpartida.persistencia.EnumConsultaSQL;

/**
 * La enumeración de consultas disponibles a realizar para el DAO de sistemas.
 * 
 * @author Loïc Prieto
 * 
 */
public enum ConsultasSistemaEnum implements EnumConsultaSQL {

	/**
	 * Obtiene todos los sistemas filtrados por nombre.
	 */
	OBTENER_SISTEMAS_POR_NOMBRE("obtenerSistemasPorNombre");

	/**
	 * La clave SQL que está presente en los ficheros yaml.
	 */
	private String	claveSQL;

	private ConsultasSistemaEnum(String claveSQL) {
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
