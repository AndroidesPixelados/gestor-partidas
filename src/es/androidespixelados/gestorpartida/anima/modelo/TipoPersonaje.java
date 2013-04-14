package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.ArrayList;
import java.util.List;

import es.androidespixelados.gestorpartida.anima.modelo.modulos.ModuloPersonaje;
import es.androidespixelados.gestorpartida.modelo.ModeloBase;

/**
 * Un tipo de personaje, preconfigurado para poder ser usado rápidamente, ya sea
 * a la hora de generar un encuentro, o de definir un personaje. No unido a
 * ningún sistema en concreto, ya que para definir sus caracterésticas, utiliza
 * módulos de atributos. Cada sistema de reglas definirá sus propios arquetipos.
 * Pueden asimilarse a clases, pero tienen vocación más generalista, para
 * aquellos sistemas que no tengan clases.
 * 
 * Los tipos son parametrizables, de tal forma que adapten su contenido a los
 * parametros que se indiquen. Por ejemplo, por Nivel (el parametro nivel
 * adaptaría el valor de los atributos de los módulos asociados). El tipo es en
 * realidad una <a
 * href="http://es.wikipedia.org/wiki/Facade_(patr%C3%B3n_de_dise%C3%B1o)"
 * >fachada</a> para los distintos módulos, ya que son en realidad los módulos
 * los que escalan por parametros.
 * 
 * @author Loïc Prieto
 * 
 */
public class TipoPersonaje extends ModeloBase {

	/**
	 * La lista de módulos asociados al tipo.
	 */
	private final List<ModuloPersonaje>	modulos;

	/**
	 * Debe ser llamado siempre por las clases que la extienden.
	 */
	public TipoPersonaje() {
		this.modulos = new ArrayList<ModuloPersonaje>();
	}

	/**
	 * Obtiene el modulos.
	 * 
	 * @return modulos
	 */
	public List<ModuloPersonaje> getModulos() {
		return modulos;
	}

}
