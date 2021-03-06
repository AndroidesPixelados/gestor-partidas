/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.vista;

import java.util.List;

import com.google.inject.Inject;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.adaptador.AdaptadorListaExpandible;
import es.androidespixelados.gestorpartida.controlador.ActividadFragmentoBase;
import es.androidespixelados.gestorpartida.controlador.FragmentoBase;
import es.androidespixelados.gestorpartida.dd4.adaptador.MenuPrincipalDD4;
import es.androidespixelados.gestorpartida.fragmento.FragmentoPantallaPrincipalDD4;
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
	//** Obtengo el TextView donde se muestra el contenido del fragment derecho **/
	//@InjectView(R.id.contenidoDerecho) private TextView contenidoDerecho;
	
	@Inject /** Se inyecta una instancia de la clase MenuPrincipalDD4 para formar la ExpandableListView **/
	private MenuPrincipalDD4 grupoMenuDD4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.obsoleto_dd4_partida_main);
		this.setTitle("Gestión de partida: WaterDeep");
		
		/** 
		 * Comprueba que la actividad está utilizando el layout que incorpora el contenedor
		 * de fragmentos
		 */
        if (findViewById(R.id.contenedorFragmento) != null) {

        	/** 
        	 * Si el usuario retrocede no se crea un nuevo nuevo fragmento, así
        	 * se evita la superposición de éstos
        	 */
            if (savedInstanceState != null) {
                return;
            }

            /** Creo una instancia del fragmento que se colocará por defecto **/
        	//TO-DO Construir una pantalla de presentación adecuada
            FragmentoPantallaPrincipalDD4 fragmentoPantallaPrincipalDD4 = new FragmentoPantallaPrincipalDD4();
            
            // In case this activity was started with special instructions from an Intent,
            // pass the Intent's extras to the fragment as arguments
            //firstFragment.setArguments(getIntent().getExtras());
            
            /**
             * El fragmento inicial es añadido al contenedor
             */
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contenedorFragmento, fragmentoPantallaPrincipalDD4).commit();
        }
		
		/** Listener necesario para cerrar automáticamente todos los menús de la lista expandible salvo el actual **/
		listaExpandible.setOnGroupExpandListener(this);	
		
		/**
		 * Damos nombre a la partida. Posteriormente se hará de forma dinámica.
		 */
		lblNombrePartida.setText("WaterDeep");
		
		/** listaGrupos contiene los valores del menú que formarán la ExpandableListView **/
		List<MenuPrincipalDD4> listaValoresMenuDD4 = grupoMenuDD4.creacionGrupos();	
		
		/** Asigno el adaptador a la ExpandableListView **/
		listaExpandible.setAdapter(new AdaptadorListaExpandible(this, listaValoresMenuDD4, R.layout.dd4_menu_principal_lista_expandible_fila_de_grupo, 
				R.layout.dd4_menu_principal_lista_expandible_fila_de_hijo_grupo, R.id.nombreGrupoMenuDD4, R.id.nombreHijoMenuDD4));
		
		/** Listener sobre los diferentes botones de la ExpandableListView **/
		listaExpandible.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
							
				android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				
				FragmentoBase fragmento = (FragmentoBase)parent.getExpandableListAdapter().getChild(groupPosition, childPosition);
				
//				if(fragmento.getArguments() != null) {
//					fragmento.setArguments(fragmento.getArguments());
//				}
				
				// Replace whatever is in the fragment_container view with this fragment,
				// and add the transaction to the back stack so the user can navigate back
				
				transaction.replace(R.id.contenedorFragmento, fragmento);
				transaction.addToBackStack(null);

				// Commit the transaction
				transaction.commit();
				
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
	    AdaptadorListaExpandible expListAdapter = new AdaptadorListaExpandible(this, grupoMenuDD4.creacionGrupos(), R.layout.dd4_menu_principal_lista_expandible_fila_de_grupo, 
	    		R.layout.dd4_menu_principal_lista_expandible_fila_de_hijo_grupo, R.id.nombreGrupoMenuDD4, R.id.nombreHijoMenuDD4);
		int len = expListAdapter.getGroupCount();

	    for (int i = 0; i < len; i++) {
	        if (i != groupPosition) {
	        	listaExpandible.collapseGroup(i);
	        }
	    }
	}
	
	

}
