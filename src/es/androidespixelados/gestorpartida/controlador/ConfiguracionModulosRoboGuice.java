/**
 *
 */
package es.androidespixelados.gestorpartida.controlador;

import com.google.inject.AbstractModule;

import es.androidespixelados.gestorpartida.persistencia.GestorPartidaSQLHelper;

/**
 * Un módulo de configuración de instanciación para roboguice.
 * 
 * @author Loïc Prieto
 * 
 */
public class ConfiguracionModulosRoboGuice extends AbstractModule {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configure() {
		// Pedimos al sistema que inyecte de forma estática el objeto Context para esta clase.
		// Es la única forma de obtenerlo, ya que debe llamar a su super constructor con un
		// contexto ya inicializado.
		requestStaticInjection(GestorPartidaSQLHelper.class);
	}

}
