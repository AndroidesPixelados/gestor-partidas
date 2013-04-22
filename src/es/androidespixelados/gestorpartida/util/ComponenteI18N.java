/**
 *
 */
package es.androidespixelados.gestorpartida.util;

import android.app.Application;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Componente para acceder a los recursos i18n en cualquier servicio
 * 
 * @author Loïc Prieto
 * 
 */
@Singleton
public class ComponenteI18N {

	/**
	 * Un contexto android para poder obtener los recursos de la aplicación.
	 */
	@Inject
	private Application	contexto;

	/**
	 * Obtiene un recurso de texto i18n de la aplicación.
	 * 
	 * @param clave
	 *            la clave generada en R para recuperar el recurso.
	 * @return el recurso o nulo si no existe.
	 */
	public String getTexto(int clave) {
		return contexto.getString(clave);
	}

	/**
	 * Obtiene un recurso de texto i18n de la aplicación.
	 * 
	 * @param clave
	 *            la clave generada en R para recuperar el recurso.
	 * @param parametros
	 *            los parametros a utilizar en el remplazo de las variables en el texto.
	 * @return el recurso con los parametros sustituidos en el texto o nulo si no existe el mismo.
	 */
	public String getTexto(int clave, Object... parametros) {
		return contexto.getString(clave, parametros);
	}

}
