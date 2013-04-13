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
	
	/** Padding de componente hijo **/
	private final int paddingSuperiorHijo = 10;
	private final int paddingInferiorHijo = 10;
	private final int paddingDerechoHijo = 30;
	private final int paddingIzquierdoHijo = 0;
	
	/** Padding de componente padre **/
	private final int paddingSuperiorPadre = 0;
	private final int paddingInferiorPadre = 0;
	private final int paddingDerechoPadre = 25;
	private final int paddingIzquierdoPadre = 0;
	
	/** Padding de texto **/
	private final int tamañoTextoChild = 16;
	private final int tamañoTextoGroup = 18;
		
	/** Elementos que componen la ExpandableListView **/
	private String nombreGrupo[] = {"Plantillas", "Personajes", "Escenas", "Utilidades", "Librería General"};
	private String nombreHijo[][] = {
			
			{"Personajes", "Clases", "Encuentros"},
			{"Jugadores", "No Jugadores"},
			{"Encuentros", "Personajes", "Imágenes", "Música", "Tramas"},
			{"Dados"},
			{"Imágenes", "Música"}
	
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
		tv.setPadding(paddingDerechoHijo, paddingSuperiorHijo, paddingIzquierdoHijo, paddingInferiorHijo);
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
		tv.setPadding(paddingDerechoPadre, paddingSuperiorPadre, paddingIzquierdoPadre, paddingInferiorPadre);
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
