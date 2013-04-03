package es.androidespixelados.gestorpartida.dd4.vista;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.TextView;
import es.androidespixelados.gestorpartida.R;

/**
 * Actividad de D&D 4Ed.
 * @author Javi Montes
 *
 */
public class DD4PartidaActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.dd4_partida_main);
		this.setTitle("Gestión de partida: WaterDeep");
		TextView lblNombrePartida = (TextView)findViewById(R.id.nombrePartida);
		lblNombrePartida.setText("WaterDeep");
		     
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dd4_partida, menu);
		return true;
	}

}
