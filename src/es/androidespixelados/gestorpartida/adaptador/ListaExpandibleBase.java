/**
 *
 */
package es.androidespixelados.gestorpartida.adaptador;

import java.util.List;

/**
 * Clase padre para cualquier lista expandible cuyo contenido sea de tipo
 * 
 * -NombreMenu 1
 * --NombreSubmenú 1
 * --NombreSubmenú 2
 * --NombreSubmenú 3
 * 
 * -NombreMenu2
 * --NombreSubmenú 1
 * --NombreSubmenú 2
 * 
 * ...etc
 * 
 *  A través de las clases que hereden de ésta se detallará el contenido de
 *  los diferentes menús
 * 
 * @author Javi Montes
 *
 */
public class ListaExpandibleBase {
	
	/** Nombre del menú padre (Grupo) **/
	private String nombreGrupoMenu;
	/** Lista de elementos que componen cada menú padre **/
	private List<SubItem> itemsGrupoMenu;
	
	/**
	 * Obtiene el nombreGrupoMenu.
	 * @return nombreGrupoMenu.
	 */
	public String getNombreGrupoMenu() {
		return nombreGrupoMenu;
	}
	/**
	 * Establece el  nombreGrupoMenu
	 * @param nombreGrupoMenu establece nombreGrupoMenu a nombreGrupoMenu
	 * @return el objeto
	 */
	public void setNombreGrupoMenu(String nombreGrupoMenu) {
		this.nombreGrupoMenu = nombreGrupoMenu;
	}
	
	/**
	 * Obtiene el itemsGrupoMenu.
	 * @return itemsGrupoMenu.
	 */
	public List<SubItem> getItemsGrupoMenu() {
		return itemsGrupoMenu;
	}
	
	/**
	 * Establece el  itemsGrupoMenu
	 * @param itemsGrupoMenu establece itemsGrupoMenu a itemsGrupoMenu
	 * @return el objeto
	 */
	public void setItemsGrupoMenu(List<SubItem> itemsGrupoMenu) {
		this.itemsGrupoMenu = itemsGrupoMenu;
	}
	
	

}
