package es.androidespixelados.gestorpartida.dd4.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * 
 * @author Javi Montes
 *
 */
public class PlantillaAdaptador extends BaseExpandableListAdapter {
	
	private Context context;
	
	private final int paddingSuperior = 10;
	private final int paddingInferior = 10;
	private final int paddingDerecho = 30;
	private final int paddingIzquierdo = 0;
	
	private final int tamañoTextoChild = 16;
	private final int tamañoTextoGroup = 18;
		
	/** Elementos que componen la ExpandableListView **/
	private String nombreGrupo[] = {"Plantillas", "Personajes", "Escenas", "Utilidades", "Librer�a General"};
	private String nombreHijo[][] = {
			
			{"Personajes", "Clases", "Encuentros"},
			{"Jugadores", "No Jugadores"},
			{"Encuentros", "Personajes", "Im�genes", "M�sica", "Tramas"},
			{"Dados"},
			{"Im�genes", "M�sica"}
	
	};

	public PlantillaAdaptador(Context context) {

		this.context = context;
		
	}
	
	/** Retorna el nombre del elemento hijo **/
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		
		return nombreHijo[groupPosition][childPosition];
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		
		TextView tv = new TextView(context);
		
		tv.setText(nombreHijo[groupPosition][childPosition]);
		tv.setPadding(paddingDerecho, paddingSuperior, paddingIzquierdo, paddingInferior);
		tv.setTextSize(tamañoTextoChild);
		
		return tv;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		
		return nombreHijo[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		
		return nombreGrupo.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		TextView tv = new TextView(context);
		
		tv.setText(nombreGrupo[groupPosition]);
		tv.setPadding(25, 0, 0, 0);
		tv.setTextSize(tamañoTextoGroup);
		
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		
		return true;
	}

}
