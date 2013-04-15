/**
 * 
 */
package es.androidespixelados.gestorpartida.anima.controlador;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import es.androidespixelados.gestorpartida.R;
import es.androidespixelados.gestorpartida.controlador.ActividadBase;

/**
 * Actividad para la gestión de la pantalla principal
 * 
 * @author loic
 * 
 */
public class AnimaPartidaActivity extends ActividadBase {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.anima_partida_main);
		this.setTitle("Gestión de partida: Vientos de LOL");
		TextView lblNombrePartida = (TextView) findViewById(R.id.nombrePartida);
		lblNombrePartida.setText("Vientos de LOL");

		// Probamos la base de datos
		SQLiteDatabase db = obtenerConexionABDD();
		Cursor resultados = db.rawQuery("SELECT * FROM sistema;", null);
		while (resultados.move(1)) {
			int id = resultados.getInt(0);
			String nombre = resultados.getString(1);

			Log.i("pruebas", "Sistema " + id + ": " + nombre);
		}
		resultados.close();
		db.close();
	}
}
