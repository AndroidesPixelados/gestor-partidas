/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.adaptador;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase auxiliar donde almacenar la información relativa al menú principal del
 * módulo DD4, de tipo ExpandableListView. Los diferentes items y subitems serán 
 * pasados al constructor del adaptador correspondiente mediante una lista de objetos.
 * 
 * @author Javi Montes
 *
 */
public class DD4MenuPrincipal {
	
	private String nombreGrupo;
	private List<String> itemsGrupoMenu;
	
	/**
	 * Obtiene el nombreGrupo.
	 * @return nombreGrupo.
	 */
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	/**
	 * Establece el  nombreGrupo
	 * @param nombreGrupo establece nombreGrupo a nombreGrupo
	 * @return el objeto
	 */
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	
	/**
	 * Obtiene el itemsGrupoMenu.
	 * @return itemsGrupoMenu.
	 */
	public List<String> getItemsGrupoMenu() {
		return itemsGrupoMenu;
	}
	/**
	 * Establece el  itemsGrupoMenu
	 * @param itemsGrupoMenu establece itemsGrupoMenu a itemsGrupoMenu
	 * @return el objeto
	 */
	public void setItemsGrupoMenu(List<String> itemsGrupoMenu) {
		this.itemsGrupoMenu = itemsGrupoMenu;
	}
	
	public List<DD4MenuPrincipal> creacionGrupos() {
		
		List<DD4MenuPrincipal> grupos = new ArrayList<DD4MenuPrincipal>();
		
		/** Creación de los cinco grupos de menú **/
		DD4MenuPrincipal plantillas = new DD4MenuPrincipal();
		plantillas.setNombreGrupo("Plantillas");
		DD4MenuPrincipal personajes = new DD4MenuPrincipal();
		personajes.setNombreGrupo("Personajes");
		DD4MenuPrincipal escenas = new DD4MenuPrincipal();
		escenas.setNombreGrupo("Escenas");
		DD4MenuPrincipal utilidades = new DD4MenuPrincipal();
		utilidades.setNombreGrupo("Utilidades");
		DD4MenuPrincipal libreriaGeneral = new DD4MenuPrincipal();
		libreriaGeneral.setNombreGrupo("Librería General");
		
		grupos.add(plantillas);
		grupos.add(personajes);
		grupos.add(escenas);
		grupos.add(utilidades);
		grupos.add(libreriaGeneral);
		
		/** Items PLantillas **/
		List<String> plantillasItems = new ArrayList<String>();
		plantillasItems.add("Personajes");
		plantillasItems.add("Clases");
		plantillasItems.add("Encuentros");
		
		List<String> personajesItems = new ArrayList<String>();
		personajesItems.add("Jugadores");
		personajesItems.add("No Jugadores");
		
		List<String> escenasItems = new ArrayList<String>();
		escenasItems.add("Encuentros");
		escenasItems.add("Personajes");
		escenasItems.add("Imágenes");
		escenasItems.add("Música");
		escenasItems.add("Tramas");
		
		List<String> utilidadesItems = new ArrayList<String>();
		utilidadesItems.add("Dados");
		
		List<String> libreriaGeneralItems = new ArrayList<String>();
		libreriaGeneralItems.add("Imágenes");
		libreriaGeneralItems.add("Música");
		
		grupos.get(0).setItemsGrupoMenu(plantillasItems);
		grupos.get(1).setItemsGrupoMenu(personajesItems);
		grupos.get(2).setItemsGrupoMenu(escenasItems);
		grupos.get(3).setItemsGrupoMenu(utilidadesItems);
		grupos.get(4).setItemsGrupoMenu(libreriaGeneralItems);
		
		return grupos;
		
	}

}
