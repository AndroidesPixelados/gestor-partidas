/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.controlador;

import roboguice.inject.InjectView;
import android.os.Bundle;
import android.widget.TextView;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.controlador.ActividadBase;

/**
 * Actividad para la gestión de la pantalla principal de ánima.
 * 
 * @author Loïc Prieto.
 * 
 */
public class AnimaPartidaActivity extends ActividadBase {

	@InjectView(R.id.nombrePartida)
	private TextView	lblNombrePartida;

	// @Inject
	// private ComponenteBDD componenteBDD;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.anima_partida_main);
		this.setTitle("Gestión de partida: Vientos de LOL");

		lblNombrePartida.setText("Vientos de LOL");

		// Probamos la inyección de servicio
		// Cursor c = componenteBDD.ejecutarConsulta("select * from partida", null);
		// while (c.move(1)) {
		// Log.d("[bdd]", "una fila encontrada, lol");
		// }
	}
}
