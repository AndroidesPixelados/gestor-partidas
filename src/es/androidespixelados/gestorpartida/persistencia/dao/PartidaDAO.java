/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Singleton;

import es.androidespixelados.gestorpartida.dd4.modelo.PartidaDungeons;
import es.androidespixelados.gestorpartida.persistencia.CursorAP;

/**
 * El DAO para gestionar las partidas.
 * 
 * @author Javi Montes
 * 
 */
@Singleton
public class PartidaDAO extends DAOBase {

	static final String	COLUMNA_NOMBRE		= "nombre";
	static final String	PARAMETRO_NOMBRE	= COLUMNA_NOMBRE;
	static final String	COLUMNA_ID			= "id";

	/**
	 * Obtiene todas los Partidas disponibles dado un nombre
	 * 
	 * @param String
	 *            nombre
	 * @return una lista de los Partidas, vacía si no hay ninguno.
	 */
	public List<PartidaDungeons> getPartidasPorNombre(String nombre) {

		List<PartidaDungeons> partidas = new ArrayList<PartidaDungeons>();

		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(PARAMETRO_NOMBRE, nombre);
		CursorAP cursor = getComponenteBDD().ejecutarConsulta(ConsultasPartidaEnum.OBTENER_PARTIDAS_POR_NOMBRE,
				parametros);

		while (cursor.move(1)) {
			PartidaDungeons partida = new PartidaDungeons();
			partida.setId(cursor.getLong(COLUMNA_ID));
			partida.setNombre(cursor.getString(COLUMNA_NOMBRE));
			partidas.add(partida);
		}

		return partidas;
	}

	public void insertaPartida(String nombre) {
		// final String COLUMNA_NOMBRE = "nombre";
		// final String PARAMETRO_NOMBRE = COLUMNA_NOMBRE;
		// //final String COLUMNA_ID = "id";
		// final String SISTEMA_FK = "sistema_fk";
		// final String PARAMETRO_SISTEMA_FK = SISTEMA_FK;
		//
		// Map<String, Object> parametros = new HashMap<String, Object>();
		// parametros.put(PARAMETRO_NOMBRE, nombre);
		// parametros.put(PARAMETRO_SISTEMA_FK, 0);
		//
		// getComponenteBDD().ejecutarConsulta(R.string.sql_partida_inserta_partida, parametros);
		getComponenteBDD().ejecutarConsulta(ConsultasPartidaEnum.INSERTAR_PRUEBA);

	}

	/**
	 * Obtiene una lista con todas las partidas disponibles
	 * 
	 * @return
	 */
	public List<PartidaDungeons> obtenerListaPartidas() {

		List<PartidaDungeons> partidas = new ArrayList<PartidaDungeons>();

		CursorAP cursor = getComponenteBDD().ejecutarConsulta(ConsultasPartidaEnum.OBTENER_TODAS_PARTIDAS);

		while (cursor.move(1)) {
			PartidaDungeons partida = new PartidaDungeons();
			partida.setId(cursor.getLong(COLUMNA_ID));
			partida.setNombre(cursor.getString(COLUMNA_NOMBRE));
			partidas.add(partida);
		}

		return partidas;
	}

}
