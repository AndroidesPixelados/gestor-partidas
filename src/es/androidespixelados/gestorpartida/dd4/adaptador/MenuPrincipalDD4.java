/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.adaptador;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;

import es.androidespixelados.gestorpartida.adaptador.ListaExpandibleBase;
import es.androidespixelados.gestorpartida.adaptador.SubItem;
import es.androidespixelados.gestorpartida.fragmento.FragmentoClases;
import es.androidespixelados.gestorpartida.fragmento.FragmentoEncuentros;
import es.androidespixelados.gestorpartida.fragmento.FragmentoPersonajes;

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
//		MenuPrincipalDD4 escenas = new MenuPrincipalDD4();
//		escenas.setNombreGrupoMenu("Escenas");
//		MenuPrincipalDD4 utilidades = new MenuPrincipalDD4();
//		utilidades.setNombreGrupoMenu("Utilidades");
//		MenuPrincipalDD4 libreriaGeneral = new MenuPrincipalDD4();
//		libreriaGeneral.setNombreGrupoMenu("Librería General");
		
		/** Se añaden los cinco grupos a la lista**/
		grupos.add(plantillas);
		grupos.add(personajes);
//		grupos.add(escenas);
//		grupos.add(utilidades);
//		grupos.add(libreriaGeneral);
		
		/** Items Plantillas **/
		List<SubItem> plantillasItems = new ArrayList<SubItem>();
		
		/** Plantillas - Personajes **/
		SubItem personajesItem = new SubItem();
		personajesItem.setNombre("Personajes");
		FragmentoPersonajes fragmentoPersonajes = new FragmentoPersonajes();
		personajesItem.setFragmento(fragmentoPersonajes);
		
		/** Plantillas - Clases **/
		SubItem clasesItem = new SubItem();
		clasesItem.setNombre("Clases");
		FragmentoClases fragmentoClases = new FragmentoClases();
		clasesItem.setFragmento(fragmentoClases);
		
		/** PLantillas Encuentros **/
		SubItem encuentrosItem = new SubItem();
		encuentrosItem.setNombre("Encuentros");
		FragmentoEncuentros fragmentoEncuentros = new FragmentoEncuentros();
		encuentrosItem.setFragmento(fragmentoEncuentros);
		
		/** Se añaden los subItems a la lista correspondiente **/
		plantillasItems.add(personajesItem);
		plantillasItems.add(clasesItem);
		plantillasItems.add(encuentrosItem);
		
		List<SubItem> personajesItems = new ArrayList<SubItem>();
		
		SubItem personajeJugador = new SubItem();
		personajeJugador.setNombre("Personaje Jugador");
		FragmentoPersonajes fragmentoPersonajeJugador = new FragmentoPersonajes();
		Bundle parametroJugador = new Bundle();
	    parametroJugador.putString("jugador", "jugador");
	    fragmentoPersonajeJugador.setArguments(parametroJugador);
	    personajeJugador.setFragmento(fragmentoPersonajeJugador);
	    
	    SubItem personajeNoJugador = new SubItem();
		personajeNoJugador.setNombre("Personaje No Jugador");
		FragmentoPersonajes fragmentoPersonajeNoJugador = new FragmentoPersonajes();
		Bundle parametroNoJugador = new Bundle();
	    parametroNoJugador.putString("jugador", "no-jugador");
	    fragmentoPersonajeNoJugador.setArguments(parametroNoJugador);
	    personajeNoJugador.setFragmento(fragmentoPersonajeNoJugador);
	    
	    personajesItems.add(personajeJugador);
	    personajesItems.add(personajeNoJugador);
		
//		/** Items Personajes **/
//		List<String> personajesItems = new ArrayList<String>();
//		personajesItems.add("Jugadores");
//		personajesItems.add("No Jugadores");
//		
//		/** Items Escenas **/
//		List<String> escenasItems = new ArrayList<String>();
//		escenasItems.add("Encuentros");
//		escenasItems.add("Personajes");
//		escenasItems.add("Imágenes");
//		escenasItems.add("Música");
//		escenasItems.add("Tramas");
//		
//		/** Items Utilidades **/
//		List<String> utilidadesItems = new ArrayList<String>();
//		utilidadesItems.add("Dados");
//		
//		/** Items Librería General **/
//		List<String> libreriaGeneralItems = new ArrayList<String>();
//		libreriaGeneralItems.add("Imágenes");
//		libreriaGeneralItems.add("Música");
		
		/** Se añaden los items a cada grupo **/
		grupos.get(0).setItemsGrupoMenu(plantillasItems);
		grupos.get(1).setItemsGrupoMenu(personajesItems);
//		grupos.get(2).setItemsGrupoMenu(escenasItems);
//		grupos.get(3).setItemsGrupoMenu(utilidadesItems);
//		grupos.get(4).setItemsGrupoMenu(libreriaGeneralItems);
		
		return grupos;
		
	}

}
