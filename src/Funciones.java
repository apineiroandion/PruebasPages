/**
 * Funciones utilizadas en la calse main
 */
public class Funciones {
    /**
     * Comprueba si el sueldo esta entre 1000 y 1750
     *
     * @param sueldo del trabajador
     * @return si esta dentro del rango
     */
    public static boolean obtenerSueldo1750(Double sueldo) {
        /*if(sueldo>=1000 && sueldo<=1750){
            return true;
        }
        return false;*/
        return (sueldo >= 1000 && sueldo <= 1750);
    }

    /**
     * Comprueba si el sueldo es menor que mil
     *
     * @param sueldo del trabajador
     * @return si esta dentro del rango
     */
    public static boolean obtenerSueldo1000(Double sueldo) {
        return (sueldo >= 0 && sueldo < 1000);
    }

    /**
     * Comprueba si el sueldo es mayor de 1750
     *
     * @param sueldo del trabajador
     * @return si esta dentro del rango
     */
    public static boolean obtenerSueldoMas1750(Double sueldo) {
        return (sueldo > 1750);
    }

    /**
     * Da de alta un trabajador
     *
     * @param nombre del trabajador que seva a crear
     * @param sueldo del trabajador que se ve a crear
     * @return trabajador nuevo
     */
    public static Trabajador darAltaTrabajador(String nombre, double sueldo) {
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre(nombre);
        trabajador.setSueldo(sueldo);
        return trabajador;
    }
}
