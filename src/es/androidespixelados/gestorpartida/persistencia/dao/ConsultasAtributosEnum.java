/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import es.androidespixelados.gestorpartida.persistencia.EnumConsultaSQL;

/**
 * Las claves de las consultas relacionadas con los atributos.
 * 
 * @author Loïc Prieto
 * 
 */
public enum ConsultasAtributosEnum implements EnumConsultaSQL {
	/**
	 * Obtiene todas las partidas filtradas por nombre.
	 */
	OBTENER_ATRIBUTOS_PERSONAJE("obtenerAtributosPorPersonaje"),
	/**
	 * Obtiene todas las partidas.
	 */
	OBTENER_TIPOS_ATRIBUTOS_SISTEMA("obtenerTiposAtributosPorSistema"),

	/**
	 * Obtiene todos los datos de un tipo de atributo por su identificador.
	 */
	OBTENER_TIPO_ATRIBUTO_POR_ID("obtenerTipoAtributoPorId");

	/**
	 * La clave SQL que está presente en los ficheros yaml.
	 */
	private String	claveSQL;

	private ConsultasAtributosEnum(String claveSQL) {
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
