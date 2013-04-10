/**
 *
 */
package es.androidespixelados.gestorpartida.dd4.modelo;

/**
 * Cada uno de los monstruos de D&D4 tiene un rol asignado en combate. Éste puede ser
 * de diferente tipo: artillería, bruto, controlador....etc. Además, aquellos pueden
 * tener rango élite o líder, potenciando sus características.
 * 
 * @author Javi Montes
 *
 */
public class Rol {
	
	/**
	 * @ID
	 */
	private Long id;
	
	/**
	 * @Nombre del rol
	 */
	private String nombre;
	
	/**
	 * @Marcador de élite
	 */
	private boolean elite;
	
	/**
	 * Marcador de líder
	 */
	private boolean lider;

	/**
	 * Obtiene el id.
	 * @return id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establece el  id
	 * @param id establece id a id
	 * @return el objeto
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre.
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el  nombre
	 * @param nombre establece nombre a nombre
	 * @return el objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el elite.
	 * @return elite.
	 */
	public boolean isElite() {
		return elite;
	}

	/**
	 * Establece el  elite
	 * @param elite establece elite a elite
	 * @return el objeto
	 */
	public void setElite(boolean elite) {
		this.elite = elite;
	}

	/**
	 * Obtiene el lider.
	 * @return lider.
	 */
	public boolean isLider() {
		return lider;
	}

	/**
	 * Establece el  lider
	 * @param lider establece lider a lider
	 * @return el objeto
	 */
	public void setLider(boolean lider) {
		this.lider = lider;
	}
	

}
