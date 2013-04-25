/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.negocio;

/**
 * Interface de prueba para los test
 * 
 * @author Javi Montes
 *
 */
public interface Warehouse {
	
	boolean hasInventory(String product, int quantity);
    void remove(String product, int quantity);

}
