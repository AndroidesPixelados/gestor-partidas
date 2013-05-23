/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.vista;

import java.util.List;

import com.google.inject.Inject;

import roboguice.inject.InjectView;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.adaptador.AdaptadorListaExpandible;
import es.androidespixelados.gestorpartida.controlador.ActividadFragmentoBase;
import es.androidespixelados.gestorpartida.controlador.FragmentoBase;
import es.androidespixelados.gestorpartida.dd4.adaptador.MenuPrincipalDD4;

/**
 * @author Javi Montes
 *
 */
public class DD4PartidaDrawerActivity extends ActividadFragmentoBase {
	
	private ActionBarDrawerToggle mDrawerToggle;
	private CharSequence mainDrawerTitle;
    private CharSequence mainTitle;  
    private List<MenuPrincipalDD4> valoresMenuDD4;
	
	/** Obtengo la vista de la ExpandedListView **/
	@InjectView(R.id.dd4_drawer_izquierdo_lista_expandible) private ExpandableListView listaExpandible;
	/** Obtengo el TextView donde se muestra el nombre de la partida **/
	//@InjectView(R.id.nombrePartida) private TextView lblNombrePartida;
	
	/** Layout del Drawer **/
	@InjectView(R.id.drawer_layout) private DrawerLayout drawerLayout;
	
	/** Se inyecta una instancia de la clase MenuPrincipalDD4 para formar la ExpandableListView **/
	@Inject 
	private MenuPrincipalDD4 grupoMenuDD4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.dd4_menu_principal);
		
		this.mainTitle = this.mainDrawerTitle = this.getTitle();
		
		// enable ActionBar app icon to behave as action to toggle nav drawer
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        
        // ActionBarDrawerToggle ties together the the proper interactions
        // between the sliding drawer and the action bar app icon
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                drawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,
                R.string.drawer_open,  /* "open drawer" description for accessibility */
                R.string.drawer_close  /* "close drawer" description for accessibility */
                
                ) {
            public void onDrawerClosed(View view) {
                getActionBar().setTitle(mainTitle); 
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle(mainDrawerTitle); 
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        
        /** Coloca un listener de manera que actúa cada vez que se abre o cierra el menú Drawer **/
        drawerLayout.setDrawerListener(mDrawerToggle);
		
		/** listaGrupos contiene los valores del menú que formarán la ExpandableListView **/
		List<MenuPrincipalDD4> listaValoresMenuDD4 = grupoMenuDD4.creacionGrupos();
		
		this.setValoresMenuDD4(listaValoresMenuDD4);
		
		/** Asigno el adaptador a la ExpandableListView **/
		listaExpandible.setAdapter(new AdaptadorListaExpandible(this, listaValoresMenuDD4, R.layout.dd4_menu_principal_lista_expandible_fila_de_grupo, 
				R.layout.dd4_menu_principal_lista_expandible_fila_de_hijo_grupo, R.id.nombreGrupoMenuDD4, R.id.nombreHijoMenuDD4));
		
		/** Listener sobre los diferentes botones de la ExpandableListView **/
		listaExpandible.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
							
				android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				
				FragmentoBase fragmento = (FragmentoBase)parent.getExpandableListAdapter().getChild(groupPosition, childPosition);
				
				transaction.replace(R.id.dd4_frame_contenido, fragmento);
				transaction.addToBackStack(null);

				// Commit the transaction
				transaction.commit();
				
				/** Coloca de título el grupo y subgrupo seleccionado **/
				setTitle(getValoresMenuDD4().get(groupPosition).getNombreGrupoMenu() + " --> " + 
						getValoresMenuDD4().get(groupPosition).getItemsGrupoMenu().get(childPosition).getNombre());
				
				/** Cierra el menú Drawer **/
				drawerLayout.closeDrawer(listaExpandible);
				
				return false;
			}
		});
		
	}
	
	/**
	 * Crea un menú de Opciones (Settings) dentro del Action Bar
	 * dentro de la Action Bar (por ahora no funcional)
	 * {@inheritDoc}
	 */
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dd4_partida, menu);
        return super.onCreateOptionsMenu(menu);
    }
	
	/* Called whenever we call invalidateOptionsMenu() */
	/**
	 * Oculta el menú Settings cuando se abre el Drawer
	 * {@inheritDoc}
	 */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = drawerLayout.isDrawerOpen(listaExpandible);
        menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }
	
	/**
	 * Abre y cierra el Drawer pulsando en el icono de la aplicación
	 * {@inheritDoc}
	 */
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
         // The action bar home/up action should open or close the drawer.
         // ActionBarDrawerToggle will take care of this.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        
        return super.onOptionsItemSelected(item);
        
    }
	
	 @Override
	    public void setTitle(CharSequence title) {
	        mainTitle = title;
	        getActionBar().setTitle(mainTitle);
	 }

	/**
	 * Obtiene el mainDrawerTitle.
	 * @return mainDrawerTitle.
	 */
	public CharSequence getMainDrawerTitle() {
		return mainDrawerTitle;
	}

	/**
	 * Establece el  mainDrawerTitle
	 * @param mainDrawerTitle establece mainDrawerTitle a mainDrawerTitle
	 * @return el objeto
	 */
	public void setMainDrawerTitle(CharSequence mainDrawerTitle) {
		this.mainDrawerTitle = mainDrawerTitle;
	}

	/**
	 * Obtiene el mainTitle.
	 * @return mainTitle.
	 */
	public CharSequence getMainTitle() {
		return mainTitle;
	}

	/**
	 * Establece el  mainTitle
	 * @param mainTitle establece mainTitle a mainTitle
	 * @return el objeto
	 */
	public void setMainTitle(CharSequence mainTitle) {
		this.mainTitle = mainTitle;
	}

	/**
	 * Obtiene el valoresMenuDD4.
	 * @return valoresMenuDD4.
	 */
	public List<MenuPrincipalDD4> getValoresMenuDD4() {
		return valoresMenuDD4;
	}

	/**
	 * Establece el  valoresMenuDD4
	 * @param valoresMenuDD4 establece valoresMenuDD4 a valoresMenuDD4
	 * @return el objeto
	 */
	public void setValoresMenuDD4(List<MenuPrincipalDD4> valoresMenuDD4) {
		this.valoresMenuDD4 = valoresMenuDD4;
	}
	 

}
