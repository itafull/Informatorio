package LEVEL_1;

import java.util.*;

/**
 * Realizar un programa que calcule el factorial de un número: n! = 1 x 2 x 3 x
 * 4 x 5 x … x (n-1) x n.
 */

public class ejercicioNro4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, nro, factorial = 1;
        System.out.println("Ingrese el numero del que desea calcular el factorial: ");
        nro = s.nextInt();
        for (i = 1; i <= nro; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + nro + " es: " + factorial);
        s.close();
    }
}
