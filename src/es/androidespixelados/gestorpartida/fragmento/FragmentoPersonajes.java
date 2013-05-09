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
public class FragmentoPersonajes extends FragmentoBase {
	
	@Override
	public View onCreateView(LayoutInflater inflater, 
			                 ViewGroup container, 
			                 Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.fragmento_personajes, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);	
		
	}

}
