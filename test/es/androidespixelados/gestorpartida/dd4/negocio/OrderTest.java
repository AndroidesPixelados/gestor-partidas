package es.androidespixelados.gestorpartida.dd4.negocio;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.xtremelabs.robolectric.RobolectricTestRunner;

import android.test.InstrumentationTestCase;
 
import static org.mockito.Mockito.*;

@RunWith(RobolectricTestRunner.class)
public class OrderTest extends InstrumentationTestCase {
	
	@Test
    public void testInStock() {
        Warehouse mockWarehouse = mock(Warehouse.class);
 
        when(mockWarehouse.hasInventory("Talisker", 50)).thenReturn(true);
 
        Order order = new Order("Talisker", 50);
        order.fill(mockWarehouse);
 
        assertTrue(order.isFilled());
        verify(mockWarehouse).remove("Talisker", 50);
    }
	
	@Test
    public void testOutOfStock() {
        Warehouse mockWarehouse = mock(Warehouse.class);
 
        when(mockWarehouse.hasInventory("Talisker", 50)).thenReturn(false);
 
        Order order = new Order("Talisker", 50);
        order.fill(mockWarehouse);
 
        assertFalse(order.isFilled());
    }
}