/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.adaptador;

import java.util.ArrayList;
import java.util.List;

import es.androidespixelados.gestorpartida.adaptador.ListaExpandibleBase;

/**
 * Clase auxiliar donde almacenar la información relativa al menú principal del
 * módulo DD4, de tipo ExpandableListView. Los diferentes items y subitems serán 
 * pasados al constructor del adaptador correspondiente mediante una lista de objetos.
 * 
 * Hereda de la clase padre ListaExpandibleBase
 * 
 * @author Javi Montes
 *
 */
public class MenuPrincipalDD4 extends ListaExpandibleBase {
	
	/**
	 * Método que crea una lista de strings con los nombres de los diferentes
	 * menús y submenús. Posteriormente, ésta será pasada como parámetro al constructor 
	 * del adaptador genérico dentro de la actividad DD4PartidaActiviyFragment
	 * 
	 * @return 
	 */
	public List<MenuPrincipalDD4> creacionGrupos() {
		
		List<MenuPrincipalDD4> grupos = new ArrayList<MenuPrincipalDD4>();
		
		/** Creación de los cinco grupos de menú **/
		MenuPrincipalDD4 plantillas = new MenuPrincipalDD4();
		plantillas.setNombreGrupoMenu("Plantillas");
		MenuPrincipalDD4 personajes = new MenuPrincipalDD4();
		personajes.setNombreGrupoMenu("Personajes");
		MenuPrincipalDD4 escenas = new MenuPrincipalDD4();
		escenas.setNombreGrupoMenu("Escenas");
		MenuPrincipalDD4 utilidades = new MenuPrincipalDD4();
		utilidades.setNombreGrupoMenu("Utilidades");
		MenuPrincipalDD4 libreriaGeneral = new MenuPrincipalDD4();
		libreriaGeneral.setNombreGrupoMenu("Librería General");
		
		/** Se añaden los cinco grupos a la lista**/
		grupos.add(plantillas);
		grupos.add(personajes);
		grupos.add(escenas);
		grupos.add(utilidades);
		grupos.add(libreriaGeneral);
		
		/** Items Plantillas **/
		List<String> plantillasItems = new ArrayList<String>();
		plantillasItems.add("Personajes");
		plantillasItems.add("Clases");
		plantillasItems.add("Encuentros");
		
		/** Items Personajes **/
		List<String> personajesItems = new ArrayList<String>();
		personajesItems.add("Jugadores");
		personajesItems.add("No Jugadores");
		
		/** Items Escenas **/
		List<String> escenasItems = new ArrayList<String>();
		escenasItems.add("Encuentros");
		escenasItems.add("Personajes");
		escenasItems.add("Imágenes");
		escenasItems.add("Música");
		escenasItems.add("Tramas");
		
		/** Items Utilidades **/
		List<String> utilidadesItems = new ArrayList<String>();
		utilidadesItems.add("Dados");
		
		/** Items Librería General **/
		List<String> libreriaGeneralItems = new ArrayList<String>();
		libreriaGeneralItems.add("Imágenes");
		libreriaGeneralItems.add("Música");
		
		/** Se añaden los items a cada grupo **/
		grupos.get(0).setItemsGrupoMenu(plantillasItems);
		grupos.get(1).setItemsGrupoMenu(personajesItems);
		grupos.get(2).setItemsGrupoMenu(escenasItems);
		grupos.get(3).setItemsGrupoMenu(utilidadesItems);
		grupos.get(4).setItemsGrupoMenu(libreriaGeneralItems);
		
		return grupos;
		
	}

}
