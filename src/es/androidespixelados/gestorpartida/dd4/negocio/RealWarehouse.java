/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.negocio;

import java.util.HashMap;

/**
 * Clase de prueba para los test
 * 
 * @author Javi Montes
 *
 */
public class RealWarehouse implements Warehouse {
	
	private HashMap products;
	
	public RealWarehouse() {
        products = new HashMap();
        products.put("Talisker", 5);
        products.put("Lagavulin", 2);
    }
 
    public boolean hasInventory(String product, int quantity) {
    	
    	int stock = inStock(product);
    	
    	if(stock >= quantity) {
    		return true;
    	} 
    	
    	return false;
    	
    }
 
    public void remove(String product, int quantity) {
        products.put(product, inStock(product) - quantity);
    }
 
    private int inStock(String product) {
        Integer quantity = (Integer) products.get(product);
        return quantity == null ? 0 : quantity;
    }
 
    

}
