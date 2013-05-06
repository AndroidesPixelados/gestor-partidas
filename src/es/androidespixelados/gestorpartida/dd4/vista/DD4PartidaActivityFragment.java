/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.vista;

import java.util.List;

import com.google.inject.Inject;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.adaptador.AdaptadorListaExpandible;
import es.androidespixelados.gestorpartida.controlador.ActividadFragmentoBase;
import es.androidespixelados.gestorpartida.dd4.adaptador.MenuPrincipalDD4;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.ExpandableListView.OnChildClickListener;
import roboguice.inject.InjectView;

/**
 * @author Javi Montes
 *
 */
public class DD4PartidaActivityFragment extends ActividadFragmentoBase implements OnGroupExpandListener {
	
	/** Obtengo la vista de la ExpandedListView **/
	@InjectView(R.id.listaExpandible) private ExpandableListView listaExpandible;
	/** Obtengo el TextView donde se muestra el nombre de la partida **/
	@InjectView(R.id.nombrePartida) private TextView lblNombrePartida;
	/** Obtengo el TextView donde se muestra el contenido del fragment derecho **/
	@InjectView(R.id.contenidoDerecho) private TextView contenidoDerecho;
	
	@Inject /** Se inyecta una instancia de la clase MenuPrincipalDD4 para formar la ExpandableListView **/
	private MenuPrincipalDD4 grupoMenuDD4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.dd4_partida_main);
		this.setTitle("Gestión de partida: WaterDeep");
		
		/** Listener necesario para cerrar automáticamente todos los menús de la lista expandible salvo el actual **/
		listaExpandible.setOnGroupExpandListener(this);	
		
		/**
		 * Damos nombre a la partida. Posteriormente se hará de forma dinámica.
		 */
		lblNombrePartida.setText("WaterDeep");
		
		/** listaGrupos contiene los valores del menú que formarán la ExpandableListView **/
		List<MenuPrincipalDD4> listaValoresMenuDD4 = grupoMenuDD4.creacionGrupos();
		
		/** Asigno el adaptador a la ExpandableListView **/
		listaExpandible.setAdapter(new AdaptadorListaExpandible(this, listaValoresMenuDD4, R.layout.fila_de_grupo, 
				R.layout.fila_de_hijo_grupo, R.id.nombreGrupoMenuDD4, R.id.nombreHijoMenuDD4));
		
		/** Listener sobre los diferentes botones de la ExpandableListView **/
		listaExpandible.setOnChildClickListener(new OnChildClickListener() {
			
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
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.widget.ExpandableListView.OnGroupExpandListener#onGroupExpand
	 * (int)
	 */
	public void onGroupExpand(int groupPosition) {
	    AdaptadorListaExpandible expListAdapter = new AdaptadorListaExpandible(this, grupoMenuDD4.creacionGrupos(), R.layout.fila_de_grupo, 
	    		R.layout.fila_de_hijo_grupo, R.id.nombreGrupoMenuDD4, R.id.nombreHijoMenuDD4);
		int len = expListAdapter.getGroupCount();

	    for (int i = 0; i < len; i++) {
	        if (i != groupPosition) {
	        	listaExpandible.collapseGroup(i);
	        }
	    }
	}
	
	

}
