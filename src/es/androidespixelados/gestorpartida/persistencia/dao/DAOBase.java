/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia.dao;

import com.google.inject.Inject;

import es.androidespixelados.gestorpartida.persistencia.ComponenteBDD;

/**
 * Clase base para los dao.
 * Define los métodos y atributos comunes de los DAO.
 * 
 * @author Loïc Prieto
 * 
 */
public abstract class DAOBase {

	@Inject
	private ComponenteBDD	componenteBDD;

	/**
	 * Obtiene el componenteBDD.
	 * 
	 * @return componenteBDD.
	 */
	protected ComponenteBDD getComponenteBDD() {
		return componenteBDD;
	}

	/**
	 * Establece el componenteBDD
	 * 
	 * @param componenteBDD
	 *            establece componenteBDD a componenteBDD
	 * @return el objeto
	 */
	protected void setComponenteBDD(ComponenteBDD componenteBDD) {
		this.componenteBDD = componenteBDD;
	}

}
