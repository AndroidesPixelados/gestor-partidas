/**
 *
 */
package es.androidespixelados.gestorpartida.anima.modelo;

/**
 * Clase base para toda clase de modelo.
 * Normalmente un objeto de dominio quedará identificado por su nombre. Utilizamos este hecho para generar el método
 * de igualdad.
 * 
 * @author Loïc Prieto
 * 
 */
public class ModeloBase {

	/**
	 * El identificador en base de datos.
	 */
	private Long	id;

	/**
	 * El atributo común a todo objeto de dominio, ya que la mayoría son elementos que se muestran en pantalla y
	 * necesitan algo que mostrar.
	 */
	private String	nombre;

	/**
	 * Obtiene el nombre.
	 * 
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre
	 * 
	 * @param nombre
	 *            establece nombre a nombre
	 * @return el objeto
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el id.
	 * 
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establece el valor de id al valor de id.
	 * 
	 * @param id
	 *            el valor a establecer
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = (PRIME * result) + ((id == null) ? 0 : id.hashCode());
		result += (PRIME * result) + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ModeloBase)) {
			return false;
		}
		ModeloBase other = (ModeloBase) obj;
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}

}
