import javax.swing.*;
import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    /**
     * numerode trabajadores entre 1000 y 1750
     */
    static Integer contador1750=0;
    /**
     * numero de trabajadores de mas de 1750
     */
    static Integer contadorMas1750=0;
    /**
     * numero de trabajadores de menos de mil
     */
    static Integer contadorMenos1000=0;

    /**
     *  JavaDoc
     *  Aumenta contador segun el rango del sueldo del trabajador
     * @param args no recibe parametros
     */

    public static void main(String[] args) {
        //Trabajador
        Trabajador auxTrabajador;
        do{
            String nombre= JOptionPane.showInputDialog("Introduce un nombre");
            double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo"));
            auxTrabajador=Funciones.darAltaTrabajador(nombre,sueldo);
            actualizarContadores(auxTrabajador);
        }while(auxTrabajador.getSueldo()!=0);
        mostrarContadores();
    }

    /**
     * Aumenta contadores segun rango
     * @param auxTrabajador trabajador actual
     */
    public static void actualizarContadores(Trabajador auxTrabajador){
        if (Funciones.obtenerSueldo1750(auxTrabajador.getSueldo())) contador1750++;
        else if (Funciones.obtenerSueldo1000(auxTrabajador.getSueldo())) contadorMenos1000++;
        else if (Funciones.obtenerSueldoMas1750(auxTrabajador.getSueldo()))contadorMas1750++;
    }

    /**
     * Muestra por consola los contadores
     */
    public static void mostrarContadores(){
        JOptionPane.showMessageDialog(null, "Hay "+contadorMas1750+" sueldos de mas de 1750€" +
                "\nHay "+contador1750+ " sueldos entre 1000€ y 1750€" +
                "\nHay "+contadorMenos1000+" sueldos de menos de 1000€");
    }
}