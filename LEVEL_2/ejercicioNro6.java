package LEVEL_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Se dispone de una lista de Empleados, de cada empleado se conoce: Nombre y
 * Apellido DNI horasTrabajadas valorPorHora Todos los empleados están cargados
 * en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x
 * valorPorHora) de toda esa lista para luego almacenar en un Map (o
 * Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo
 * calculado.
 * 
 */
public class ejercicioNro6 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(40, 300, "Pintos  ", "Viviana ", "40.123.614");
        Empleado emp2 = new Empleado(35, 250, "Mattos  ", "Debora  ", "32.820.516");
        Empleado emp3 = new Empleado(30, 300, "Garcia  ", "Janet   ", "34.446.194");
        Empleado emp4 = new Empleado(25, 250, "Araujo  ", "Itati   ", "33.064.262");
        Empleado emp5 = new Empleado(20, 300, "Lopez   ", "Noelia  ", "32.732.914");
        Empleado emp6 = new Empleado(25, 250, "Gimenez ", "Ivana   ", "36.316.765");
        Empleado emp7 = new Empleado(30, 300, "Ramirez ", "Ivan    ", "34.836.643");

        Set<Empleado> empleados = new HashSet<>() {
            {
                add(emp1);
                add(emp2);
                add(emp3);
                add(emp4);
                add(emp5);
                add(emp6);
                add(emp7);
            }
        };
        Map<String, Integer> sueldos = new HashMap<>();

        for (Empleado em : empleados) {
            sueldos.put(em.dni, (em.horasTrabajadas * em.valorPorHora));
        }

        System.out.println(sueldos.get(emp1.dni) + "   DNI: " + emp1.dni);
        System.out.println(sueldos.get(emp2.dni) + "   DNI: " + emp2.dni);
        System.out.println(sueldos.get(emp3.dni) + "   DNI: " + emp3.dni);
        System.out.println(sueldos.get(emp4.dni) + "   DNI: " + emp4.dni);
        System.out.println(sueldos.get(emp5.dni) + "   DNI: " + emp5.dni);
        System.out.println(sueldos.get(emp6.dni) + "   DNI: " + emp6.dni);
        System.out.println(sueldos.get(emp7.dni) + "   DNI: " + emp7.dni);

    }
}
