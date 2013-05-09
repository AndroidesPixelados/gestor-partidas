/**
 *
 */
package es.androidespixelados.gestorpartida.adaptador;

import es.androidespixelados.gestorpartida.controlador.FragmentoBase;

/**
 * @author Javi Montes
 *
 */
public class SubItem {
	
	private String nombre;
	private FragmentoBase fragmento;
	/**
	 * Obtiene el nombre.
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el  nombre
	 * @param nombre establece nombre a nombre
	 * @return el objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene el fragmento.
	 * @return fragmento.
	 */
	public FragmentoBase getFragmento() {
		return fragmento;
	}
	/**
	 * Establece el  fragmento
	 * @param fragmento establece fragmento a fragmento
	 * @return el objeto
	 */
	public void setFragmento(FragmentoBase fragmento) {
		this.fragmento = fragmento;
	}
	
	
}
