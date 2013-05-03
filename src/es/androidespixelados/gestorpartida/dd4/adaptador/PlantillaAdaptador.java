package es.androidespixelados.gestorpartida.dd4.adaptador;

import java.util.List;

import es.androidespixelados.gestorpartida.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Adaptador necesario para la lista expandible del menú DD4
 * 
 * @author Javi Montes
 *
 */
public class PlantillaAdaptador extends BaseExpandableListAdapter {
	
	/** Contexto **/
	private Context context;
	/** Lista con los valores del menú **/
	private List<DD4MenuPrincipal> valoresMenuDD4;

	public PlantillaAdaptador(Context context, List<DD4MenuPrincipal> valoresMenuDD4) {

		this.context = context;
		this.valoresMenuDD4 = valoresMenuDD4;
		
	}
	
	/** Retorna el nombre del elemento hijo **/
	@Override
	public Object getChild(int groupPosition, int childPosition) {	
		return valoresMenuDD4.get(groupPosition).getItemsGrupoMenu().get(childPosition);
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		
		if (convertView == null) {
		    LayoutInflater inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    convertView = inflater.inflate(R.layout.fila_de_hijo_grupo, null);
		   }
		    
		   TextView nombreHijoMenuDD4 = (TextView) convertView.findViewById(R.id.nombreHijoMenuDD4);
		   nombreHijoMenuDD4.setText(valoresMenuDD4.get(groupPosition).getItemsGrupoMenu().get(childPosition));
		    
		   return convertView;
		
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return valoresMenuDD4.get(groupPosition).getItemsGrupoMenu().size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		return valoresMenuDD4.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		
		if(convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.fila_de_grupo, null);
		}
		
		TextView nombreGrupoMenuDD4 = (TextView) convertView.findViewById(R.id.nombreGrupoMenuDD4);
		nombreGrupoMenuDD4.setText(valoresMenuDD4.get(groupPosition).getNombreGrupo());
		
		return convertView;
		
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
