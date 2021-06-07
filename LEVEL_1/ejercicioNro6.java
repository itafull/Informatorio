package LEVEL_1;

import java.util.*;

/**
 * Se desea una aplicación que solicite 2 números enteros y realice la operación
 * de potencia (sin uso de librerías).
 */
public class ejercicioNro6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base, exponente, potencia = 1;
        System.out.println("Ingrese la base: ");
        base = s.nextInt();
        System.out.println("Ingrese la potencia: ");
        exponente = s.nextInt();
        for (int i = 0; i < exponente; i++) {
            potencia = potencia * base;
        }
        System.out.println(base + " elevado a " + exponente + " = " + potencia);
        s.close();
    }
}
