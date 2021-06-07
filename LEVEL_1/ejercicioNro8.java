package LEVEL_1;

import java.util.*;

/**
 * Crear una aplicación que solicite de entrada los datos de una persona en este
 * orden: Nombre y Apellido Edad Dirección Ciudad Luego imprimirá el siguiente
 * mensaje: {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */
public class ejercicioNro8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ciudad, direccion, nombre, mensaje;
        System.out.println("Ingrese ciudad: ");
        ciudad = s.nextLine();
        System.out.println("Ingrese direccion:");
        direccion = s.nextLine();
        System.out.println("Ingrese nombre:");
        nombre = s.nextLine();
        System.out.println("Ingrese edad");
        int edad = s.nextInt();
        mensaje = ciudad + " - " + direccion + " - " + edad + " - " + nombre;
        System.out.println(mensaje);
        s.close();
    }
}
