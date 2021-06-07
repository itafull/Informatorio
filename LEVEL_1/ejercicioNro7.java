package LEVEL_1;

import java.util.*;

/**
 * Realizar un Programa que dado un String de entrada en minúsculas lo convierta
 * por completo a mayúsculas. Sin uso de métodos o librerías que realicen
 * toUppercase().
 */
public class ejercicioNro7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra, palabraMayuscula = "";
        System.out.println("Ingrese una palabra en minuscula: ");
        palabra = s.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            palabraMayuscula += UppercaseArcaico(palabra.charAt(i));
        }
        System.out.println(palabraMayuscula);
        s.close();
    }

    public static char UppercaseArcaico(char c) {
        switch (c) {
            case 'a':
                return 'A';
            case 'b':
                return 'B';
            case 'c':
                return 'C';
            case 'd':
                return 'D';
            case 'e':
                return 'E';
            case 'f':
                return 'F';
            case 'g':
                return 'G';
            case 'h':
                return 'H';
            case 'i':
                return 'I';
            case 'j':
                return 'J';
            case 'k':
                return 'K';
            case 'm':
                return 'M';
            case 'n':
                return 'N';
            case 'l':
                return 'L';
            case 'o':
                return 'O';
            case 'p':
                return 'P';
            case 'q':
                return 'Q';
            case 'r':
                return 'R';
            case 's':
                return 'S';
            case 't':
                return 'T';
            case 'u':
                return 'U';
            case 'v':
                return 'V';
            case 'w':
                return 'W';
            case 'x':
                return 'X';
            case 'y':
                return 'Y';
            case 'z':
                return 'Z';
            default:
                return c;
        }
    }
}
