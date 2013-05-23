/**
 *
 */
package es.androidespixelados.gestorpartida.fragmento;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import roboguice.inject.InjectView;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.adaptador.AdaptadorListaPersonajes;
import es.androidespixelados.gestorpartida.controlador.FragmentoBase;
import es.androidespixelados.gestorpartida.dd4.adaptador.MenuPrincipalDD4;
import es.androidespixelados.gestorpartida.dd4.modelo.PersonajePrueba;
import es.androidespixelados.gestorpartida.dd4.negocio.PersonajeNegocio;
import es.androidespixelados.gestorpartida.iniciomenu.MenuEleccionReglasActivity;
import es.androidespixelados.gestorpartida.iniciomenu.MenuInicialActivity;

/**
 * @author Javi Montes
 *
 */
public class FragmentoPersonajes extends FragmentoBase {
	
	/** Obtengo la vista de la ExpandedListView **/
	//@InjectView(R.id.botonCargarPersonajes) private Button botonCargarPersonajes;
	/** Obtengo el TextView donde se muestra el nombre de la partida **/
	//@InjectView(R.id.pepe) private TextView textoPepe;
	//@InjectView(R.id.listaPersonajes) private ListView listaPersonajes;
	
	@Inject
	private PersonajeNegocio personajeNegocio;
	
	@Override
	public View onCreateView(LayoutInflater inflater, 
			                 ViewGroup container, 
			                 Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.dd4_fragmento_personajes,
		        container, false);
		
		//Button botonCargarPersonajes = (Button) view.findViewById(R.id.botonCargarPersonajes);
		Button botonMostrarPepe = (Button) view.findViewById(R.id.botonMostrarPepe);
		ListView listaPersonajes = (ListView) view.findViewById(R.id.listaPersonajes);
		TextView textoPepe = (TextView) view.findViewById(R.id.pepe);
		
		PersonajePrueba uno = new PersonajePrueba();
		PersonajePrueba dos = new PersonajePrueba();
		PersonajePrueba tres = new PersonajePrueba();
		
		uno.setNombre("Fulano");
		uno.setTipo("Anima");
		dos.setNombre("Mengano");
		dos.setTipo("DD4");
		tres.setNombre("Zutano");
		tres.setTipo("Vampiro");
		
		List<PersonajePrueba> lista = new ArrayList<PersonajePrueba>();
		lista.add(uno);
		lista.add(dos);
		lista.add(tres);
		
		listaPersonajes.setAdapter(new AdaptadorListaPersonajes(this.getActivity().getApplicationContext(), lista));
		
		
		try {
			textoPepe.setText(this.getArguments().getString("jugador"));
		} catch (NullPointerException e) {
			Log.i("Aviso", "valor nulo en el argumento del fragmento");
		}
		
			
		
//		botonCargarPersonajes.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//
//				String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
//				        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//				        "Linux", "OS/2" };
//				    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
//				    		android.R.layout.simple_list_item_1, values);
//				    
//				    listaPersonajes.setAdapter(adapter);
//				
//			}
//		});
		
		botonMostrarPepe.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//String personaje = personajeNegocio.obtenerNombrePersonaje();
				
				Intent menuPrincipal = new Intent(getActivity(), MenuInicialActivity.class);
				startActivity(menuPrincipal);
				
			}
		});
		
		
		//return inflater.inflate(R.layout.fragmento_personajes, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);	
		
	}

}
