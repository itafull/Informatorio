package LEVEL_1;

import java.util.*;

/**
 * Se desea una aplicación que solicite 2 números enteros y realice la operación
 * de multiplicación por sumas sucesivas (sin uso de librerías).
 */
public class ejercicioNro5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nro1, nro2, resultado = 0;
        System.out.println("Ingrese la dos numeros: ");
        nro1 = s.nextInt();
        nro2 = s.nextInt();
        int aux = 0;
        System.out.println("Proceso de las sumas: ");
        for (int i = 0; i < nro2; i++) {
            resultado = resultado + nro1;
            aux = nro1;
            System.out.println(aux + " +" + (resultado - aux) + "=" + resultado);
        }
        System.out.println("Resultado de la multiplicacion");
        System.out.println(nro1 + " * " + nro2 + " = " + resultado);
        s.close();
    }
}
