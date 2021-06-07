package LEVEL_1;

import java.util.*;

/**
 * Realizar un programa que solicite por consola 2 números enteros. Para luego
 * imprimir el resultado de la suma, resta, multiplicación, división y módulo
 * (resto de la división) de ambos números.
 */

public class ejercicioNRo2 {
    public static void main(String[] args) {
        int nro1 = 0;
        int nro2 = 0;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;
        int modulo = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        nro1 = s.nextInt();
        System.out.println("Ingrese otro numero: ");
        nro2 = s.nextInt();
        suma = (nro1 + nro2);
        resta = (nro1 - nro2);
        multiplicacion = (nro1 * nro2);
        division = (nro1 / nro2);
        modulo = (nro1 % nro2);

        System.out.println(nro1 + " + " + nro2 + " = " + suma);
        System.out.println(nro1 + " - " + nro2 + " = " + resta);
        System.out.println(nro1 + " * " + nro2 + " = " + multiplicacion);
        System.out.println(nro1 + " / " + nro2 + " = " + division);
        System.out.println(nro1 + " % " + nro2 + " = " + modulo);

        s.close();
    }
}
