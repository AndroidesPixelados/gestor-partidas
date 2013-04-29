/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.vista;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.controlador.ActividadFragmentoBase;
import es.androidespixelados.gestorpartida.dd4.adaptador.PlantillaAdaptador;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.ExpandableListView.OnChildClickListener;
import roboguice.inject.InjectView;

/**
 * @author Javi Montes
 *
 */
public class DD4PartidaActivityFragment extends ActividadFragmentoBase {
	
	/** Obtengo la vista de la ExpandedListView **/
	@InjectView(R.id.plantillas) private ExpandableListView plantillas;
	/** Obtengo el TextView donde se muestra el nombre de la partida **/
	@InjectView(R.id.nombrePartida) private TextView lblNombrePartida;
	/** Obtengo el TextView donde se muestra el contenido del fragment derecho **/
	@InjectView(R.id.contenidoDerecho) private TextView contenidoDerecho;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.dd4_partida_main);
		this.setTitle("Gestión de partida: WaterDeep");
		
		/**
		 * Damos nombre a la partida. Posteriormente se hará de forma dinámica.
		 */
		lblNombrePartida.setText("WaterDeep");
		
		/** Asigno el adaptador a la ExpandableListView **/
		plantillas.setAdapter(new PlantillaAdaptador(this));
		
		/** Listener sobre los diferentes botones de la ExpandableListView **/
		plantillas.setOnChildClickListener(new OnChildClickListener() {
			
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
