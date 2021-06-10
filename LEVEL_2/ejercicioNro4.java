package LEVEL_2;

import java.util.*;

/**
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
 * en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */
public class ejercicioNro4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>(Arrays.asList("MATTOS DEBORA", "GARCIA JANET", "SOTELO MAITEN",
                "MONZON ANDREA", "GIMENEZ IVANA", "GARCIA PABLO", "LEZCANO ANDREA", "LOPEZ NOELIA", "PEREZ RUBEN",
                "PINTOS VIVIANA", "FLOREZ SELENE", "ARAUJO ITATI"));
        List<String> cursoNro1 = alumnos.subList(0, 4);
        System.out.println("Alumnos del curso 1: ");
        for (int i = 0; i < cursoNro1.size(); i++) {
            System.out.println(cursoNro1.get(i));
        }

        List<String> cursoNro2 = alumnos.subList(4, 8);
        System.out.println("Alumnos del curso 2: ");
        for (int i = 0; i < cursoNro2.size(); i++) {
            System.out.println(cursoNro2.get(i));
        }

        List<String> cursoNro3 = alumnos.subList(8, 12);
        System.out.println("Alumnos del curso 3: ");
        for (int i = 0; i < cursoNro3.size(); i++) {
            System.out.println(cursoNro3.get(i));
        }
    }
}
