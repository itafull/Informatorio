package LEVEL_2;

//import java.util.*;

/**
 * Necesitamos la clase empleado para porque ahorarnos la instanciacion en el
 * ejercicioNro6 Ademas que usamos mas los conceptos de programacion orientada a
 * objetos
 */
public class Empleado {
  int horasTrabajadas;
  int valorPorHora;
  String nombre;
  String apellido;
  String dni;

  public Empleado(int horasTrabajadas, int valorPorHora, String apellido, String nombre, String dni) {
    this.dni = dni;
    this.horasTrabajadas = horasTrabajadas;
    this.valorPorHora = valorPorHora;
    this.apellido = apellido;
    this.nombre = nombre;
  }

}
