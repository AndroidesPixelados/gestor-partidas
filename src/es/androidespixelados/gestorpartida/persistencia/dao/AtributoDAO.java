/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Singleton;

import es.androidespixelados.gestorpartida.modelo.Atributo;
import es.androidespixelados.gestorpartida.modelo.TipoAtributo;
import es.androidespixelados.gestorpartida.modelo.TipoDato;
import es.androidespixelados.gestorpartida.persistencia.CursorAP;
import es.androidespixelados.gestorpartida.persistencia.EnumUtil;

/**
 * DAO para todas las operaciones relacionadas con los atributos.
 * 
 * @author Loïc Prieto.
 * 
 */
@Singleton
public class AtributoDAO extends DAOBase {
	/**
	 * Una caché de tipos de atributos por id, ya que es más frecuente que se consulten
	 * los tipos de atributos que cualquier otro objeto de modelo de los atributos.
	 */
	private Map<Long, TipoAtributo>			cacheTiposAtributos				= new HashMap<Long, TipoAtributo>();

	/**
	 * Una caché de tipos de atributos listados por id de sistema.
	 */
	private Map<Long, List<TipoAtributo>>	cacheTiposAtributosPorSistema	= new HashMap<Long, List<TipoAtributo>>();

	// Columnas de tipo_atributo
	private final static String				NOMBRE_COLUMNA_ID				= "id";
	private final static String				NOMBRE_COLUMNA_NOMBRE			= "nombre";
	private final static String				NOMBRE_COLUMNA_DESCRIPCION		= "descripcion";
	private final static String				NOMBRE_COLUMNA_TIPO_SINTACTICO	= "tipo_sintactico";
	private final static String				NOMBRE_COLUMNA_TIPO_SEMANTICO	= "tipo_semantico";
	// Columnas de atributo
	private final static String				NOMBRE_COLUMNA_VALOR			= "valor";
	private final static String				NOMBRE_COLUMNA_TIPO_ATRIBUTO_FK	= "tipo_atributo_fk";

	public List<TipoAtributo> obtenerTiposAtributosPorSistema(Long idSistema) {
		final String parametroIdSistema = "idSistema";
		List<TipoAtributo> tiposAtributos = cacheTiposAtributosPorSistema.get(idSistema);

		if (tiposAtributos == null) {
			tiposAtributos = new ArrayList<TipoAtributo>();

			Map<String, Object> parametros = new HashMap<String, Object>();
			parametros.put(parametroIdSistema, idSistema);
			CursorAP cursor = getComponenteBDD().ejecutarConsulta(
					ConsultasAtributosEnum.OBTENER_TIPOS_ATRIBUTOS_SISTEMA, parametros);

			while (cursor.moveToNext()) {
				TipoAtributo tipoAtributo = cargarTipoAtributo(cursor);

				cacheTiposAtributos.put(tipoAtributo.getId(), tipoAtributo);

				tiposAtributos.add(tipoAtributo);
			}

			cacheTiposAtributosPorSistema.put(idSistema, tiposAtributos);
		}

		return tiposAtributos;
	}

	public TipoAtributo obtenerTipoAtributoPorId(Long idTipoAtributo) {
		TipoAtributo resultado = cacheTiposAtributos.get(idTipoAtributo);

		if (resultado == null) {
			final String parametroIdTipoAtributo = "idTipoAtributo";
			Map<String, Object> parametros = new HashMap<String, Object>();
			parametros.put(parametroIdTipoAtributo, idTipoAtributo);
			CursorAP cursor = getComponenteBDD().ejecutarConsulta(ConsultasAtributosEnum.OBTENER_TIPO_ATRIBUTO_POR_ID,
					parametros);

			if (cursor.moveToNext()) {
				resultado = this.cargarTipoAtributo(cursor);
				cacheTiposAtributos.put(idTipoAtributo, resultado);
			}
		}

		return resultado;
	}

	/**
	 * Carga los datos de un tipo de atributo a partir de un cursor posicionado en un registro apropiado.
	 * 
	 * @param cursor
	 * @return
	 */
	private TipoAtributo cargarTipoAtributo(CursorAP cursor) {
		TipoDato tipoSintactico = EnumUtil.convertirValorPersistenteAEnumeracion(TipoDato.class,
				cursor.getLong(NOMBRE_COLUMNA_TIPO_SINTACTICO));

		TipoAtributo tipoAtributo = new TipoAtributo();
		tipoAtributo.setId(cursor.getLong(NOMBRE_COLUMNA_ID));
		tipoAtributo.setNombre(cursor.getString(NOMBRE_COLUMNA_NOMBRE));
		tipoAtributo.setDescripcion(cursor.getString(NOMBRE_COLUMNA_DESCRIPCION));
		tipoAtributo.setSemantico(cursor.getString(NOMBRE_COLUMNA_TIPO_SEMANTICO));
		tipoAtributo.setSintactico(tipoSintactico);

		return tipoAtributo;
	}

	/**
	 * Obtiene los atributos de un personaje a partir de su identificador.
	 * 
	 * @param idPersonaje
	 * @return un mapa de atributos, donde la clave es el nombre del tipo de atributo
	 */
	public Map<String, Atributo> obtenerAtributosPorPersonaje(Long idPersonaje) {
		final String parametroIdPersonaje = "idPersonaje";
		Map<String, Atributo> atributos = new HashMap<String, Atributo>();

		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(parametroIdPersonaje, idPersonaje);
		CursorAP cursor = getComponenteBDD().ejecutarConsulta(ConsultasAtributosEnum.OBTENER_ATRIBUTOS_PERSONAJE,
				parametros);

		while (cursor.moveToNext()) {
			TipoAtributo tipoAtributo = this.obtenerTipoAtributoPorId(cursor.getLong(NOMBRE_COLUMNA_TIPO_ATRIBUTO_FK));

			Atributo atributo = new Atributo();
			atributo.setId(cursor.getLong(NOMBRE_COLUMNA_ID));
			atributo.setValor(cursor.getString(NOMBRE_COLUMNA_VALOR));
			atributo.setTipo(tipoAtributo);

			atributos.put(tipoAtributo.getNombre(), atributo);
		}

		return atributos;
	}
}
