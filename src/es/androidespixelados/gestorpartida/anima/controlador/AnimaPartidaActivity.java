/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.controlador;

import java.util.List;

import roboguice.inject.InjectView;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.inject.Inject;

import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.controlador.ActividadBase;
import es.androidespixelados.gestorpartida.modelo.Sistema;
import es.androidespixelados.gestorpartida.persistencia.dao.SistemaDAO;

/**
 * Actividad para la gestión de la pantalla principal de ánima.
 * 
 * @author Loïc Prieto.
 * 
 */
public class AnimaPartidaActivity extends ActividadBase {

	@InjectView(R.id.nombrePartida)
	private TextView	lblNombrePartida;

	@Inject
	private SistemaDAO	sistemaDAO;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.anima_partida_main);
		this.setTitle("Gestión de partida: Vientos de LOL");

		// Prueba de inyección de vista
		lblNombrePartida.setText("Vientos de LOL");

		// Prueba de inyección de dao
//		List<Sistema> sistemas = sistemaDAO.getSistemasPorNombre("i");
//		for (Sistema sistema : sistemas) {
//			Log.i("datos", "Sistema encontrado: " + sistema.getNombre());
//		}
	}
}
