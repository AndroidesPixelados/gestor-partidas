/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Singleton;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.modelo.Sistema;
import es.androidespixelados.gestorpartida.persistencia.CursorAP;

/**
 * El DAO para gestionar las operaciones de persistencia sobre los sistemas.
 * 
 * @author Loïc Prieto
 * 
 */
@Singleton
public class SistemaDAO extends DAOBase {

	/**
	 * Obtiene todos los sistemas disponibles.
	 * 
	 * @return una lista de los sistemas, vacía si no hay ninguno.
	 */
	public List<Sistema> getSistemasPorNombre(String nombre) {
		final String COLUMNA_NOMBRE = "nombre";
		final String PARAMETRO_NOMBRE = COLUMNA_NOMBRE;
		final String COLUMNA_ID = "id";

		List<Sistema> sistemas = new ArrayList<Sistema>();

		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(PARAMETRO_NOMBRE, nombre);
		CursorAP cursor = getComponenteBDD().ejecutarConsulta(R.string.sql_sistema_select_por_nombre, parametros);

		while (cursor.move(1)) {
			Sistema sistema = new Sistema();
			sistema.setId(cursor.getLong(COLUMNA_ID));
			sistema.setNombre(cursor.getString(COLUMNA_NOMBRE));
			sistemas.add(sistema);
		}

		return sistemas;
	}
}
