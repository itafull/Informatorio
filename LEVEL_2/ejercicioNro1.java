package LEVEL_2;

import java.util.*;

/**
 * Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
 * imprimir por pantalla el ranking.
 */
public class ejercicioNro1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        String ciudad;
        int estado = 1;
        while (estado == 1) {
            System.out.println("Ingrese una ciudad: ");
            ciudad = s1.nextLine();
            ciudades.add(ciudad);
            System.out.println("Desea agregar otra ciudad? 1-SI 0-NO");
            estado = s2.nextInt();
        }
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i + 1) + " - " + ciudades.get(i));
        }
        s1.close();
        s2.close();

    }
}
