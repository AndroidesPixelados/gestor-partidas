/**
 *
 */
package es.androidespixelados.gestorpartida.persistencia;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Clase de utilidades para gestionar las enumeraciones.
 * 
 * @author Loïc Prieto.
 * 
 */
public class EnumUtil {

	/**
	 * Convierte un valor persistente a un valor de enumeración.
	 * Este método asume que E implementa la interfaz EnumeracionPersistente&lt;T&gt; y además
	 * que implementa también un método estático "E desdeValorPersistente(T valor)", que no puede
	 * reflejarse en interfaz alguna por limitaciones de las enumeraciones.
	 * 
	 * @param enumeracion
	 * @param valor
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T, E> E convertirValorPersistenteAEnumeracion(Class<E> enumeracion, T valor) {
		boolean esEnumeracionCorrecta = false;
		final String errorEnumeracionIncorrecta = "La enumeración debe implementar el método E desdeValorPersistente(T valor) para poder ser llamada en esta función.";
		E resultado = null;

		if (valor != null) {
			// Comprobación de que la clase pasada como enumeración implemente la interfaz que queremos.
			for (Type i : enumeracion.getGenericInterfaces()) {
				if (i instanceof EnumeracionPersistente<?>) {
					esEnumeracionCorrecta = true;
					break;
				}
			}

			if (esEnumeracionCorrecta) {
				try {
					Method conversor = enumeracion.getMethod("desdeValorPersistente", valor.getClass());
					resultado = (E) conversor.invoke(null, valor);
				} catch (NoSuchMethodException nsme) {
					throw new IllegalArgumentException(errorEnumeracionIncorrecta);
				} catch (IllegalAccessException e) {
					throw new IllegalArgumentException(errorEnumeracionIncorrecta);
				} catch (InvocationTargetException e) {
					throw new IllegalArgumentException(errorEnumeracionIncorrecta);
				}

			} else {
				throw new IllegalArgumentException(
						"Parametro de enumeración no válido. Debe extender EnumeracionPersistente.");
			}
		}

		return resultado;
	}
}
