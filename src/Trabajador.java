/**
 * Clase para los datos de los trabajadores
 * @author Angel Piñeiro
 * @version v1.0
 */
public class Trabajador {
    /**
     * nombre del trabajador
     */
    private String nombre;
    /**
     * sueldo del trabajador
     */
    private Double sueldo;

    /**
     * Actualiza el nombre del trabajador
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza el sueldo del trabajador
     * @param sueldo
     */

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Devuelve el sueldo del trabajador
     * @return suelo
     */

    public Double getSueldo() {
        return sueldo;
    }

    /**
     * Devuelve el nombre del trabajador
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
}
