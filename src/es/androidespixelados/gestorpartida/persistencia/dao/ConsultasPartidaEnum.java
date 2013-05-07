/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import es.androidespixelados.gestorpartida.persistencia.EnumConsultaSQL;

/**
 * La enumeración de consultas disponibles a realizar para el DAO de partidas.
 * 
 * @author Loïc Prieto
 * 
 */
public enum ConsultasPartidaEnum implements EnumConsultaSQL {

	/**
	 * Obtiene todas las partidas filtradas por nombre.
	 */
	OBTENER_PARTIDAS_POR_NOMBRE("obtenerPartidasPorNombre"),
	/**
	 * Obtiene todas las partidas.
	 */
	OBTENER_TODAS_PARTIDAS("obtenerTodasPartidas"),

	/**
	 * Inserta una partida.
	 */
	INSERTAR("insertarPartida"),

	/**
	 * Inserta una partida de prueba.
	 */
	INSERTAR_PRUEBA("insertarPartidaPrueba");

	/**
	 * La clave SQL que está presente en los ficheros yaml.
	 */
	private String	claveSQL;

	private ConsultasPartidaEnum(String claveSQL) {
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
