/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.vista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import es.androidespixelados.gestorpartida.R;

/**
 * Actividad para la gestión de la pantalla principal
 * 
 * @author loic
 * 
 */
public class AnimaPartidaActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.anima_partida_main);
		this.setTitle("Gestión de partida: Vientos de LOL");
		TextView lblNombrePartida = (TextView) findViewById(R.id.nombrePartida);
		lblNombrePartida.setText("Vientos de LOL");
	}
}
