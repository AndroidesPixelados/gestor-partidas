/**
 *
 */
package es.androidespixelados.gestorpartida.fragmento;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.controlador.FragmentoBase;

/**
 * @author Javi Montes
 *
 */
public class FragmentoEncuentros extends FragmentoBase {
	
	@Override
	public View onCreateView(LayoutInflater inflater, 
			                 ViewGroup container, 
			                 Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.dd4_fragmento_encuentros, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);
	}

}
