/**
 *
 */
package es.androidespixelados.gestorpartida.adaptador;

import java.util.List;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.dd4.modelo.PersonajePrueba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * @author Javi Montes
 *
 */
public class AdaptadorListaPersonajes extends BaseAdapter {
	
	/** Contexto **/
	private Context context;
	/** Lista de personajes **/
	private List<PersonajePrueba> listaPersonajes;
	
	/**
	 * Constructor
	 */
	public AdaptadorListaPersonajes(Context contexto, List<PersonajePrueba> listaPersonajes) {
		super();
		this.context = contexto;
		this.listaPersonajes = listaPersonajes;
	}
	

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public int getCount() {
		return listaPersonajes.size();
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public Object getItem(int posicion) {		
		return listaPersonajes.get(posicion);
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public View getView(int posicion, View convertView, ViewGroup parent) {
		
		if (convertView == null) {
		    LayoutInflater inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    convertView = inflater.inflate(R.layout.dd4_fragmento_personajes_lista_personajes, null);
		}
		
		TextView nombre = (TextView)convertView.findViewById(R.id.nombre);
        nombre.setText(listaPersonajes.get(posicion).getNombre());
        
        TextView tipo = (TextView)convertView.findViewById(R.id.tipo);
        tipo.setText(listaPersonajes.get(posicion).getTipo());
        
        
		return convertView;
	}

}
