package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class TipoPersonaje {
	/**
	 * El nombre del módulo.
	 */
	private String									nombre;

	/**
	 * El mapa de atributos que los módulos van a manipular.
	 * La clave del mapa será un Enum que extienda de uno genérico
	 * del proyecto, de tal forma que los módulos provean las
	 * propias claves para acceder.
	 */
	private Map<EnumeracionAtributosBase, Object>	mapaAtributos;

	/**
	 * La lista de módulos asociados al tipo.
	 */
	private final List<Modulo>						modulos;

	/**
	 * Debe ser llamado siempre por las clases que la extienden.
	 */
	public TipoPersonaje() {
		this.mapaAtributos = new HashMap<EnumeracionAtributosBase, Object>();
		this.modulos = new ArrayList<Modulo>();
	}

	/**
	 * Añade un módulo al tipo. Asocia el módulo al tipo.
	 * 
	 * @param modulo
	 */
	public void addModulo(final Modulo modulo) {
		this.modulos.add(modulo);
	}

	/**
	 * Elimina un módulo de la lista de módulos del tipo de personaje.
	 * 
	 * @param modulo
	 *            el módulo a eliminar
	 */
	public void removeModulo(final Modulo modulo) {
		this.modulos.remove(modulo);
	}

	/**
	 * Obtiene el nombre.
	 * 
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre
	 * 
	 * @param nombre
	 *            establece nombre a nombre
	 * @return el objeto
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el mapaAtributos.
	 * 
	 * @return mapaAtributos.
	 */
	public Map<EnumeracionAtributosBase, Object> getMapaAtributos() {
		return mapaAtributos;
	}

	/**
	 * Establece el mapaAtributos
	 * 
	 * @param mapaAtributos
	 *            establece mapaAtributos a mapaAtributos
	 * @return el objeto
	 */
	public void setMapaAtributos(final Map<EnumeracionAtributosBase, Object> mapaAtributos) {
		this.mapaAtributos = mapaAtributos;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = (PRIME * result) + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TipoPersonaje)) {
			return false;
		}
		final TipoPersonaje other = (TipoPersonaje) obj;
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}

}
