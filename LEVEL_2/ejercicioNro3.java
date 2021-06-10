package LEVEL_2;

import java.util.*;

/**
 * Crear una lista que contenga como elementos la numeración de cartas de una
 * baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList
 * (en orden), imprimir, imprimir en orden inverso (reverse), desordenar
 * (mezclar) el arrayList y volver a imprimir.
 */
public class ejercicioNro3 {
    public static void main(String[] args) {

        List<String> francesa = new ArrayList<>(
                Arrays.asList("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"));
        System.out.println("Elementos de la baraja: ");
        for (int i = 0; i < francesa.size(); i++) {
            System.out.println(francesa.get(i));
        }

        Collections.reverse(francesa);
        System.out.println("Elementos de la baraja de forma inversa: ");
        for (int i = 0; i < francesa.size(); i++) {
            System.out.println(francesa.get(i));
        }

        Collections.shuffle(francesa);
        System.out.println("Elementos de la baraja mezclados: ");
        for (int i = 0; i < francesa.size(); i++) {
            System.out.println(francesa.get(i));
        }
    }
}
