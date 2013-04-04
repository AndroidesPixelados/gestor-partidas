package es.androidespixelados.gestorpartida.iniciomenu;

import es.androidespixelados.gestorpartida.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Actividad para el menú inicial de la aplicación
 * @author Javi Montes
 *
 */
public class MenuInicialActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu_inicial_aplicacion);
		
		/**Botón Nueva Partida**/
		final Button btnNuevaPartida = (Button)findViewById(R.id.botonNuevaPartida);
		
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
	}

}
