/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo.modulos;

import java.util.Map;

import es.androidespixelados.gestorpartida.modelo.Atributo;

/**
 * Ejecutor de escalado de ejemplo para ilustrar el funcionamiento de los módulos de personajes.
 * La implementación no vale para nada.
 * 
 * @author Loïc Prieto
 * 
 */
public class EjecutorEscaladoGuerreroAnima implements EjecutorEscaladoPersonaje {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void escalar(Map<String, Atributo> atributos, Map<String, ParametroModulo> parametros) {
		final String PARAMETRO_NIVEL = "nivel";
		final String PARAMETRO_DIFICULTAD = "dificultad";
		final String ATRIBUTO_FUERZA = "fuerza";
		final int MULTIPLICADOR_FUERZA = 2;

		Integer nivel = (Integer) parametros.get(PARAMETRO_NIVEL).getValor();
		Integer dificultad = (Integer) parametros.get(PARAMETRO_DIFICULTAD).getValor();

		atributos.get(ATRIBUTO_FUERZA).setValor(nivel * MULTIPLICADOR_FUERZA * dificultad);
	}

}
