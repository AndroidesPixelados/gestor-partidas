package es.androidespixelados.gestorpartida.adaptador;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Adaptador genérico para cualquier lista expandible cuyo contenido sea de tipo
 * 
 * -NombreMenu 1
 * --Submenú 1
 * --Submenú 2
 * --Submenú 3
 * 
 * -NombreMenu2
 * --Submenú 1
 * --Submenú 2
 * 
 * ...etc 
 * @author Javi Montes
 *
 */
public class AdaptadorListaExpandible extends BaseExpandableListAdapter {
	
	/** Contexto **/
	private Context context;
	/** Lista con los valores del menú **/
	private List<? extends ListaExpandibleBase> valoresMenu;
	/** ID del layout Grupo Hijo **/
	private int idVistaGrupoHijo;
	/** ID del layout Grupo Padre **/
	private int idVistaGrupoPadre;
	/** ID del TextView Padre **/
	private int idTextViewPadre;
	/** ID del TextView hijo **/
	private int idTextViewHijo;
	
	/**
	 * Constructor
	 * 
	 * @param context El contexto de la aplicación
	 * @param valoresMenu Lista de valores a representar en el menú expandible
	 * @param IdVistaGrupoPadre ID de la vista de los valores padre
	 * @param IdVistaGrupoHijo ID de la vista de los valores hijo
	 * @param idTextViewPadre ID del TextView que mostrará los valores padre
	 * @param idTextViewHijo ID del TextView que mostrará los valores hijo
	 */
	public AdaptadorListaExpandible(Context context, List<? extends ListaExpandibleBase> valoresMenu, 
			int idVistaGrupoPadre, int idVistaGrupoHijo, int idTextViewPadre, int idTextViewHijo ) {

		this.context = context;
		this.valoresMenu = valoresMenu;
		this.idVistaGrupoPadre = idVistaGrupoPadre;
		this.idVistaGrupoHijo = idVistaGrupoHijo;
		this.idTextViewPadre = idTextViewPadre;
		this.idTextViewHijo = idTextViewHijo;
		
	}
	
	/** Retorna el nombre del elemento hijo **/
	@Override
	public Object getChild(int groupPosition, int childPosition) {	
		return valoresMenu.get(groupPosition).getItemsGrupoMenu().get(childPosition).getFragmento();
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/** Retorna la vista del elemento hijo **/
	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		
		if (convertView == null) {
		    LayoutInflater inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    convertView = inflater.inflate(idVistaGrupoHijo, null);
		   }
		    
		   TextView nombreHijoMenu = (TextView) convertView.findViewById(idTextViewHijo);
		   nombreHijoMenu.setText(valoresMenu.get(groupPosition).getItemsGrupoMenu().get(childPosition).getNombre());
		    
		   return convertView;
		
	}
	
	/** Retorna el número de hijos por cada elemento padre **/
	@Override
	public int getChildrenCount(int groupPosition) {
		return valoresMenu.get(groupPosition).getItemsGrupoMenu().size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		
		return groupPosition;
	}
	
	/** Retorna el número de elementos padre (grupos) **/
	@Override
	public int getGroupCount() {
		return valoresMenu.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}
	
	/** Retorna la vista del elemento padre **/
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		
		if(convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(idVistaGrupoPadre, null);
		}
		
		TextView nombreGrupoMenu = (TextView) convertView.findViewById(idTextViewPadre);
		nombreGrupoMenu.setText(valoresMenu.get(groupPosition).getNombreGrupoMenu());
		
		return convertView;
		
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/** Permite seleccionar los diferentes elementos hijos (retorna true) **/
	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {		
		return true;
	}

}
