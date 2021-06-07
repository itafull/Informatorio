package LEVEL_1;

import java.util.*;

/**
 * Confeccionar un programa que dado un número entero como dato de entrada
 * imprima la secuencia de números (incrementos de 1) de la siguiente forma:
 */

public class ejercicioNro3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        s.close();
    }
}
