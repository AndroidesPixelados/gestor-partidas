/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.modelo.modulos;

import java.util.List;

import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * El módulo de comportamiento de un tipo de personaje.
 * Un módulo de personaje opera sobre los atributos de un tipo de personaje para definir un comportamiento respecto
 * de una serie de parametros.
 * Obviamente, este comportamiento es propio a un sistema, por lo que queda ligado el módulo al sistema.
 * El propio comportamiento de escalado se delega en clases que implementen la interfaz EjecutorEscalado, y se recuperan
 * de base de datos para añadirlas al módulo correspondiente.
 * 
 * Ej: Podría definirse (en base de datos) un módulo GuerreroAnima cuyo parámetro sea el Nivel, que se encargue de
 * redistribuir los atributos de un tipo de personaje según el Nivel definido, primando la fuerza y habilidades
 * combativas.
 * Otro módulo podría definir como parametros el Nivel y la Dificultad para escalar los atributos del tipo de personaje
 * al que se asocia.
 * 
 * @author Loïc Prieto
 * 
 */
public class ModuloPersonaje extends ModeloBase {

	/**
	 * La lista de parámetros del módulo.
	 */
	private List<ParametroModulo>		parametros;

	/**
	 * La clase que se encarga de realizar el escalado.
	 * Se obtiene por reflexión, extraído su nombre de clase de la base de datos. En cualquier caso implementa
	 * esta interfaz.
	 */
	private EjecutorEscaladoPersonaje	ejecutorEscalado;

	/**
	 * Obtiene el parametros.
	 * 
	 * @return parametros
	 */
	public List<ParametroModulo> getParametros() {
		return parametros;
	}

	/**
	 * Establece el valor de parametros al valor de parametros.
	 * 
	 * @param parametros
	 *            el valor a establecer
	 */
	public void setParametros(List<ParametroModulo> parametros) {
		this.parametros = parametros;
	}

	/**
	 * Obtiene el ejecutorEscalado.
	 * 
	 * @return ejecutorEscalado
	 */
	public EjecutorEscaladoPersonaje getEjecutorEscalado() {
		return ejecutorEscalado;
	}

	/**
	 * Establece el valor de ejecutorEscalado al valor de ejecutorEscalado.
	 * 
	 * @param ejecutorEscalado
	 *            el valor a establecer
	 */
	public void setEjecutorEscalado(EjecutorEscaladoPersonaje ejecutorEscalado) {
		this.ejecutorEscalado = ejecutorEscalado;
	}

}
