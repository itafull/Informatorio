package LEVEL_1;

import java.util.*;

/**
 * Solicitar por consola el nombre del usuario e imprimir por pantalla el
 * siguiente mensaje “HOLA {USUARIO}!!!”
 */

public class ejercicioNro1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = s.nextLine();
        System.out.println("HOLA " + nombre);
        s.close();
    }
}
