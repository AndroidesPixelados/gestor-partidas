/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import es.androidespixelados.gestorpartida.modelo.Atributo;
import es.androidespixelados.gestorpartida.modelo.Personaje;
import es.androidespixelados.gestorpartida.persistencia.CursorAP;

/**
 * Todas las operaciones relacionadas con los personajes
 * 
 * @author Loïc Prieto.
 * 
 */
@Singleton
public class PersonajeDAO extends DAOBase {

	@Inject
	private AtributoDAO			atributoDAO;

	private static final String	NOMBRE_COLUMNA_NOMBRE	= "nombre";

	/**
	 * Carga todos los datos de un personaje.
	 * 
	 * @param idPersonaje
	 *            el identificador del personaje
	 * @return
	 */
	public Personaje obtenerPersonaje(Long idPersonaje) {
		final String parametroIdPersonaje = "idPersonaje";
		Personaje personaje = null;

		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(parametroIdPersonaje, idPersonaje);
		CursorAP cursor = getComponenteBDD().ejecutarConsulta(ConsultasPersonajeEnum.OBTENER_PERSONAJE_POR_ID,
				parametros);
		if (cursor.moveToNext()) {

			Map<String, Atributo> atributos = atributoDAO.obtenerAtributosPorPersonaje(idPersonaje);

			personaje = new Personaje();
			personaje.setId(idPersonaje);
			personaje.setNombre(cursor.getString(NOMBRE_COLUMNA_NOMBRE));
			personaje.setAtributos(atributos);

			// TODO: Obtener las tramas
		}

		return personaje;
	}
}
