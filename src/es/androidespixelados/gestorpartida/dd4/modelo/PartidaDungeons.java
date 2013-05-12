package es.androidespixelados.gestorpartida.dd4.modelo;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.Partida;

/**
 * Clase descriptora de la Partida (o campaña) como concepto de grupo de escenas que
 * componen una unidad y cuya duración normalmente abarca varios días, semanas o meses.
 * 
 * @author Javi Montes
 *
 */
public class PartidaDungeons extends Partida {
	
	//TO-DO: Incluir personajes
	
	/**
	 * Lista de escenas
	 */
	private List<EscenaDungeons> listaEscenas;

	/**
	 * Obtiene el listaEscenas.
	 * @return listaEscenas.
	 */
	public List<EscenaDungeons> getListaEscenas() {
		return listaEscenas;
	}

	/**
	 * Establece el  listaEscenas
	 * @param listaEscenas establece listaEscenas a listaEscenas
	 * @return el objeto
	 */
	public void setListaEscenas(List<EscenaDungeons> listaEscenas) {
		this.listaEscenas = listaEscenas;
	}
	

}
