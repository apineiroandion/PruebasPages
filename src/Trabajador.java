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


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


    public Double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }
}
