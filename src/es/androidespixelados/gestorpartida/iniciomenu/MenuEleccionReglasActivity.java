package es.androidespixelados.gestorpartida.iniciomenu;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.anima.vista.AnimaPartidaActivity;
import es.androidespixelados.gestorpartida.dd4.vista.DD4PartidaActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Actividad para el menú de elección de reglas
 * @author Javi Montes
 *
 */
public class MenuEleccionReglasActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.menu_eleccion_reglas);
		
		/**Botones de elección de reglas**/
		final Button btnAnima = (Button)findViewById(R.id.botonAnima);
		final Button btnDungeons4 = (Button)findViewById(R.id.botonDungeons4);
		/**Falta por implementar el botón de Vampiro**/
		
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
				
				startActivity(intent);
				
			}
		});
	}

}
