package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.Escena;

/**
 * Las escenas representan, de forma más o menos aproximada, un conjunto homogeneo de encuentros,
 * situaciones y descripciones comunes durante un espacio de tiempo, Podría utilizarse como analogía
 * el concepto de partida diaria dentro de una campaña general, aunque su tiempo de juego no siempre
 * se circunscribe al día.
 * 
 * Como elementos destacados se incluyen las tramas asociadas, lista de encuentros y lista de personajes
 * que intervienen, tanto jugadores como no jugadores.
 * 
 * @author Javi Montes
 * 
 */
public class EscenaDungeons extends Escena {

	/**
	 * Lista de encuentros que incluye la escena
	 */
	private List<EncuentroDungeons>	encuentros;

	/**
	 * Lista de personajes que incluye la escena
	 */
	private List<PersonajeDungeons>	personajes;

	/**
	 * Obtiene el encuentros.
	 * 
	 * @return encuentros.
	 */
	@Override
	public List<EncuentroDungeons> getEncuentros() {
		return encuentros;
	}

	/**
	 * Obtiene el personajes.
	 * 
	 * @return personajes.
	 */
	@Override
	public List<PersonajeDungeons> getPersonajes() {
		return personajes;
	}

}
