package LEVEL_2;

import java.util.*;

/**
 * Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
 * entero al principio de la lista y otro al final. Por último, iterar e
 * imprimir los elementos de la lista y el tamaño de la misma (antes y después
 * de agregar a en la primera y última posición).
 */
public class ejercicioNro2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("El tamaño de la lista es " + numeros.size());
        numeros.add(0, 30);
        numeros.add(35);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("El tamaño de la lista es " + numeros.size());
    }
}
