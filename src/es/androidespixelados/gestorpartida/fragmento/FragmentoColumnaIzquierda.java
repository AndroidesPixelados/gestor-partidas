package es.androidespixelados.gestorpartida.fragmento;

import es.androidespixelados.gestorpartida.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragmento del menú izquierdo
 * @author Javi Montes
 *
 */
public class FragmentoColumnaIzquierda extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, 
			                 ViewGroup container, 
			                 Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.fragmento_columna_izquierda, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);
		
		//lstListado = (ListView)getView().findViewById(R.id.LstListado);		
		
	}

}
