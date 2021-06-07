package LEVEL_1;

import java.util.*;

/**
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces
 * que aparece una letra dada.
 */
public class ejercicioNro9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = s.nextLine().toLowerCase();
        System.out.println("Ingrese una letra para buscar en la frase: ");
        char letra = s.next().toLowerCase().charAt(0);
        int contadorLetra = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contadorLetra++;
            }
        }
        System.out.println("El caracter aparece " + contadorLetra + " veces");
        s.close();
    }
}
