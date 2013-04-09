/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo.encuentros;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.androidespixelados.gestorpartida.anima.modelo.ModeloBase;
import es.androidespixelados.gestorpartida.anima.modelo.TipoPersonaje;
import es.androidespixelados.gestorpartida.anima.modelo.modulos.ParametroModulo;

/**
 * Un tipo de encuentro define los tipos de personaje involucrados en el encuentro así como la cantidad de los mismos.
 * El funcionamiento de un tipo de encuentro es análogo al del módulo de un personaje: el usuario elige qué ejecutores
 * de escalado quiere usar para el encuentro, define los parametros de los mismos y deja que sean los ejecutores los que
 * definan el contenido del encuentro. Una vez realizado el trabajo de los ejecutores de escalado, puede retocar
 * los resultados. Todo se guarda en base de datos.
 * 
 * Ej: El usuario define un tipo de encuentro Ciudad. Agrega los ejecutores de escalado Ladrones y Magos. Se definen los
 * parametros nivel de los personajes jugadores, cantidad de jugadores, y ejecuta el escalado. Se añaden automaticamente
 * al encuentro tres tipos de personaje ladrón y dos tipos de personaje mago. Este tipo de encuentro será elegible a la
 * hora de crear un encuentro posteriormente (definiendo en su momento los parametros de los tipos de personajes).
 * 
 * @author Loïc Prieto
 * 
 */
public class TipoEncuentro extends ModeloBase {
	private Map<TipoPersonaje, Integer>		cantidadTiposPersonajes;

	private List<EjecutorEscaladoEncuentro>	ejecutoresEscalado;

	/**
	 * Constructor.
	 */
	public TipoEncuentro() {
		this.cantidadTiposPersonajes = new HashMap<TipoPersonaje, Integer>();
	}

	/**
	 * Escala el encuentro en relación a los parametros dados. Si existieran cantidades definidas ya de tipos de
	 * personajes, los sobreescribe.
	 * 
	 * @param parametros
	 *            los parametros a pasar a los ejecutores. Se obtienen de forma externa a esta clase. Normalmente
	 *            vendrán de la interfaz de usuario.
	 */
	public void escalarEncuentro(Map<String, ParametroModulo> parametros) {
		for (EjecutorEscaladoEncuentro ejecutor : ejecutoresEscalado) {
			ejecutor.escalarEncuentro(parametros, cantidadTiposPersonajes);
		}
	}

	/**
	 * Obtiene el cantidadTiposPersonajes.
	 * 
	 * @return cantidadTiposPersonajes
	 */
	public Map<TipoPersonaje, Integer> getCantidadTiposPersonajes() {
		return cantidadTiposPersonajes;
	}

	/**
	 * Establece el valor de cantidadTiposPersonajes al valor de cantidadTiposPersonajes.
	 * 
	 * @param cantidadTiposPersonajes
	 *            el valor a establecer
	 */
	public void setCantidadTiposPersonajes(Map<TipoPersonaje, Integer> cantidadTiposPersonajes) {
		this.cantidadTiposPersonajes = cantidadTiposPersonajes;
	}

	/**
	 * Obtiene el ejecutoresEscalado.
	 * 
	 * @return ejecutoresEscalado
	 */
	public List<EjecutorEscaladoEncuentro> getEjecutoresEscalado() {
		return ejecutoresEscalado;
	}

	/**
	 * Establece el valor de ejecutoresEscalado al valor de ejecutoresEscalado.
	 * 
	 * @param ejecutoresEscalado
	 *            el valor a establecer
	 */
	public void setEjecutoresEscalado(List<EjecutorEscaladoEncuentro> ejecutoresEscalado) {
		this.ejecutoresEscalado = ejecutoresEscalado;
	}

}
