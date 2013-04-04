package es.androidespixelados.gestorpartida.dd4.vista;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.TextView;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.dd4.adaptador.PlantillaAdaptador;

/**
 * Actividad de D&D 4Ed.
 * @author Javi Montes
 *
 */
public class DD4PartidaActivity extends FragmentActivity {

	private ExpandableListView plantillas;
	private TextView contenidoDerecho;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.dd4_partida_main);
		this.setTitle("Gestión de partida: WaterDeep");
		
		/** Obtengo el TextView donde se muestra el nombre de la partida **/
		TextView lblNombrePartida = (TextView)findViewById(R.id.nombrePartida);
		contenidoDerecho = (TextView)findViewById(R.id.contenidoDerecho);
		
		/**
		 * Damos nombre a la partida. Posteriormente se hará de forma dinámica.
		 */
		lblNombrePartida.setText("WaterDeep");
		
		/** Obtengo la vista de la ExpandedListView **/
		this.plantillas = (ExpandableListView)findViewById(R.id.plantillas);
		/** Asigno el adaptador a la ExpandableListView **/
		this.plantillas.setAdapter(new PlantillaAdaptador(this));
		
		
		/** Listener sobre los diferentes botones de la ExpandableListView **/
		this.plantillas.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
				
				/** Obtiene el nombre de la opción seleccionada **/
				String opcionSeleccionada = (String)parent.getExpandableListAdapter().getChild(groupPosition, childPosition);
				
				/** Coloca el nombre de la opción seleccionada en el fragmento derecho **/
				contenidoDerecho.setText(opcionSeleccionada);
				
				return false;
			}
		});
		     
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dd4_partida, menu);
		return true;
	}

}
