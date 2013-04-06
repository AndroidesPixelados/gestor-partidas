/**
 *
 */
package es.androidespixelados.gestorpartida.anima.modelo;

import java.util.Map;

/**
 * Define una serie de atributos y accesores a los mismos agrupados por funcionalidad. Por ejemplo, el módulo de
 * Atributos básicos (Nombre, vida, maná), el bloque de atributos de Anima: (Fuerza, Destreza, etc), el módulo de
 * habilidades de anima (Percepción, Estilo, etc).
 * 
 * Dividiendo los atributos en módulos, se puede reutilizar el código.
 * 
 * Los módulos deben implementar un método de escalado de los atributos en función a un parametro que el módulo defina
 * (Por ejemplo, nivel). Asimismo, deben proporcionar accesores a los atributos que añaden al tipo de personaje (a los
 * cuales acceden como un mapa de la clase, aunque enlaza a un mapa del tipo de personaje al que definen). Estos
 * accesores deben ser definidos por una enumeración.
 * 
 * @author Loïc Prieto
 */
public abstract class Modulo extends ModeloBase {

	/**
	 * El contenedor del módulo.
	 */
	private TipoPersonaje	contenedor;

	/**
	 * Obtiene el mapa de atributos del contenedor, para poder ser manipulado por el módulo.
	 * 
	 * @return el mapa de atributos.
	 */
	final protected Map<EnumeracionAtributosBase, Object> getMapaAtributosContenedor() {
		return contenedor.getMapaAtributos();
	}

	/**
	 * Establece el tipo de personaje al cual se asocia este módulo.A través de este tipo, puede el módulo añadir sus
	 * atributos. Cuando se invoca este método, el método establecerAtributos es llamado para que los submódulos puedan
	 * establecer sus atributos en el tipo.
	 * 
	 * @param contenedor
	 *            establece contenedor a contenedor
	 * @return el objeto
	 */
	final public void setContenedor(final TipoPersonaje contenedor) {
		this.contenedor = contenedor;
		this.establecerAtributos(getMapaAtributosContenedor());
	}

	/**
	 * Este es un método llamado cuando el módulo es asociado al tipo de personaje contenedor. Cada subclase de módulo
	 * deberá implementarlo para añadir sus atributos al contenedor.
	 * 
	 * @param mapaAtributos
	 *            el mapa de atributos del contenedor.
	 */
	protected abstract void establecerAtributos(final Map<EnumeracionAtributosBase, Object> mapaAtributos);

}
