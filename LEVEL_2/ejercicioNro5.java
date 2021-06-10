package LEVEL_2;

import java.util.*;

/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y
 * valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
 * Se debe generar otra lista que contenga los totales y luego imprimir el total
 * final a cobrar
 * 
 */
public class ejercicioNro5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));

        List<Integer> valorPorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

        List<Integer> sueldos = new ArrayList<>();
        for (int i = 0; i < horasTrabajadas.size(); i++) {
            sueldos.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        int sueldoSemanal = 0;
        for (int i = 0; i < sueldos.size(); i++) {
            sueldoSemanal += sueldos.get(i);
        }
        System.out.println("Sueldo Semanal: " + sueldoSemanal);
    }
}
