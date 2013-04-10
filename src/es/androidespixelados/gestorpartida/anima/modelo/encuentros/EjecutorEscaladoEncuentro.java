/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo.encuentros;

import java.util.Map;

import es.androidespixelados.gestorpartida.anima.modelo.TipoPersonaje;
import es.androidespixelados.gestorpartida.anima.modelo.modulos.ParametroModulo;

/**
 * Delegación del escalado de personajes en un encuentro.
 * 
 * @see TipoEncuentro
 * 
 * @author Loïc Prieto
 * 
 */
public interface EjecutorEscaladoEncuentro {

	/**
	 * Escala el encuentro respecto de los parametros pasados. Rellena la lista de personajes con personajes
	 * inicializados.
	 * 
	 * @param parametros
	 *            la lista de parametros que afecta al escalado.
	 * @param personajes
	 *            la lista de tipos personajes a rellenar. Viene inicializada.
	 */
	void escalarEncuentro(Map<String, ParametroModulo> parametros, Map<TipoPersonaje, Integer> personajes);
}
