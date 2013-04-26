package es.androidespixelados.gestorpartida.iniciomenu;

import com.google.inject.Inject;

import roboguice.inject.InjectView;
import android.app.Activity;
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
import es.androidespixelados.gestorpartida.dd4.vista.DD4PartidaActivity;

/**
 * Actividad para el men� de elección de reglas
 * 
 * @author Javi Montes
 * 
 */
public class MenuEleccionReglasActivity extends ActividadBase {
	
	@Inject
	private PartidaNegocio	partidaNegocio;
	
	@InjectView(R.id.botonAnima) Button btnAnima;
	@InjectView(R.id.botonDungeons4) Button btnDungeons4;
	@InjectView(R.id.botonVampiro) Button btnVampiro;
	@InjectView(R.id.inputNombrePartida) EditText txtNombre;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu_eleccion_reglas);

		/** Botones de elección de reglas **/
		//final Button btnAnima = (Button) findViewById(R.id.botonAnima);
		//final Button btnDungeons4 = (Button) findViewById(R.id.botonDungeons4);
		/** Falta por implementar el botón de Vampiro **/

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

				Intent intent = new Intent(MenuEleccionReglasActivity.this, DD4PartidaActivity.class);
				
				/**
				 * Recoge el nombre de la partida y lo graba en la base de datos
				 */
				String nombrePartida = txtNombre.getText().toString();
				partidaNegocio.insertaPartidaEnBDD(nombrePartida);

				startActivity(intent);

			}
		});
	}

}
