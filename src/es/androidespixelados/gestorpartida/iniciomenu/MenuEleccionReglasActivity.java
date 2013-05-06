package es.androidespixelados.gestorpartida.iniciomenu;

import com.google.inject.Inject;

import roboguice.inject.InjectView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.anima.controlador.AnimaPartidaActivity;
import es.androidespixelados.gestorpartida.controlador.ActividadBase;
import es.androidespixelados.gestorpartida.dd4.negocio.PartidaNegocio;
import es.androidespixelados.gestorpartida.dd4.vista.DD4PartidaActivityFragment;

/**
 * Actividad para el men� de elección de reglas
 * 
 * @author Javi Montes
 * 
 */
public class MenuEleccionReglasActivity extends ActividadBase {
	
	@Inject
	private PartidaNegocio	partidaNegocio;
	
	/** Botones Anima, DD4 y Vampiro **/
	@InjectView(R.id.botonAnima) private Button btnAnima;
	@InjectView(R.id.botonDungeons4) private Button btnDungeons4;
	@InjectView(R.id.botonVampiro) private Button btnVampiro;
	/** Entrada de texto para el nombre de la partida **/
	@InjectView(R.id.inputNombrePartida) private EditText txtNombre;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu_eleccion_reglas);

		/**
		 * Listener sobre el botón de Anima
		 */
		btnAnima.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(MenuEleccionReglasActivity.this, AnimaPartidaActivity.class);

				startActivity(intent);

			}
		});

		/**
		 * Listener sobre el botón de Dungeons 4
		 */
		btnDungeons4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(MenuEleccionReglasActivity.this, DD4PartidaActivityFragment.class);
				
				/**
				 * Recoge el nombre de la partida y lo graba en la base de datos
				 */
				//String nombrePartida = txtNombre.getText().toString();
				//partidaNegocio.insertaPartidaEnBDD(nombrePartida);

				startActivity(intent);

			}
		});
	}

}
