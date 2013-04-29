package es.androidespixelados.gestorpartida.iniciomenu;

import java.util.List;

import com.google.inject.Inject;

import roboguice.inject.InjectView;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.controlador.ActividadBase;
import es.androidespixelados.gestorpartida.dd4.negocio.PartidaNegocio;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Actividad para el menú inicial de la aplicación
 * @author Javi Montes
 *
 */
public class MenuInicialActivity extends ActividadBase {
	
	@Inject
	private PartidaNegocio	partidaNegocio;
	
	@InjectView(R.id.botonNuevaPartida) private Button btnNuevaPartida;
	@InjectView(R.id.botonCargarPartida) private Button btnCargarPartida;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu_inicial_aplicacion);
		
		/**Botón Nueva Partida**/
		//final Button btnNuevaPartida = (Button)findViewById(R.id.botonNuevaPartida);
		
		
		/**
		 * Evento click lleva al menú de elección de reglas
		 */
		btnNuevaPartida.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(MenuInicialActivity.this, MenuEleccionReglasActivity.class);
				
				startActivity(intent);
				
			}
		});
		
		/**
		 * Evento click lleva al menú de cargar la partida
		 */
		btnCargarPartida.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// Prueba capa negocio
				List<String> partidas = partidaNegocio.retornaFrasesConPartida();
				for (String partida : partidas) {
					Log.i("datos", "Sistema encontrado: " + partida);
				}
				
			}
		});
	}

}
