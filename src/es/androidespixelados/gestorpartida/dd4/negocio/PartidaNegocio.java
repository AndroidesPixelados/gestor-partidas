/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.negocio;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import es.androidespixelados.gestorpartida.dd4.modelo.PartidaDungeons;
import es.androidespixelados.gestorpartida.persistencia.dao.PartidaDAO;

/**
 * @author Javi Montes
 *
 */
public class PartidaNegocio {
	
	@Inject
	private PartidaDAO	partidaDAO;
	
	/**
	 * Retorna una lista formateada
	 * @return
	 */
	public List<String> retornaFrasesConPartida() {
		
		/**Obtiene la lista de partidas desde la BDD**/
		List<PartidaDungeons> listaPartidas = this.partidaDAO.obtenerListaPartidas();
		/**Inicia la lista donde almacenar y procesar los nombres**/
		List<String> listaNombres = new ArrayList<String>();
		 
		// Prueba de inyección de dao
		for (PartidaDungeons partida : listaPartidas) {
			listaNombres.add("El nombre de la partida es: " + partida.getNombre());
		}
		
		return listaNombres;
		 
	}
	
	/**
	 * Inserta una partida en la BDD
	 * @param nombrePartida
	 */
	public void insertaPartidaEnBDD(String nombrePartida) {
		this.partidaDAO.insertaPartida(nombrePartida);
	}

}
