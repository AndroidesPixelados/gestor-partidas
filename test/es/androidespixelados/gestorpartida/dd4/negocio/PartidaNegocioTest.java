package es.androidespixelados.gestorpartida.dd4.negocio;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.xtremelabs.robolectric.RobolectricTestRunner;

import es.androidespixelados.gestorpartida.persistencia.dao.PartidaDAO;
import es.androidespixelados.gestorpartida.dd4.modelo.Partida;

import static org.mockito.Mockito.*;

@RunWith(RobolectricTestRunner.class)
public class PartidaNegocioTest {
	
	@Test
	public void retornaFrasesTest() {
		
		//given
		PartidaDAO partidaDAOmock = mock(PartidaDAO.class);
		
		//inject to XyzService class under test
		//when(partidaDAOmock.obtenerListaPartidas()).willReturn(Arrays.asList(String));
		
	}

}
