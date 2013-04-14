/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo.modulos;

import java.util.Map;

import es.androidespixelados.gestorpartida.modelo.Atributo;

/**
 * Una interfaz que define el comportamiento a implementar por las clases
 * que sean elegibles para actuar en módulos de personajes.
 * 
 * @author Loïc Prieto
 * 
 */
public interface EjecutorEscaladoPersonaje {
	/**
	 * Función llamada cuando el módulo debe escalar los atributos del personaje. Recibe la lista de atributos a
	 * modificar y los parametros con un valor específico.
	 * 
	 * @param atributos
	 *            un mapa de atributos, en el que la clave es el nombre del atributo.
	 * @param parametros
	 *            un mapa de parametros, donde la clave es el nombre del parametro.
	 */
	void escalar(Map<String, Atributo> atributos, Map<String, ParametroModulo> parametros);
}
