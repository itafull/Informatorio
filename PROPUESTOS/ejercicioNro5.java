package PROPUESTOS;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioNro5 {
    public static void main(String[] args) {
        Scanner eString = new Scanner(System.in);

        String filePath = "PROPUESTOS\\ejercicioNro5.txt";

        File file = new File(filePath);
        String path = file.getAbsolutePath();

        ArrayList<Empleado> empleados = LeerArchivoPorLineas(path);

        System.out.println("Ingrese la letra del apellido que desea buscar: ");
        String letra = eString.nextLine();
        Empleado[] empleadosLetra = EmpleadoWithLetterOnLastname(letra, empleados);
        System.out.println("Los empleados con la letra " + letra + " son: ");
        for (int i = 0; i < empleadosLetra.length; i++) {
            if (empleadosLetra[i] != null) {
                System.out.println(empleadosLetra[i]);
            }
        }
        System.out.println();

        Empleado[] menorYmayor = getOlderAndYoungerEmpleado(empleados);
        System.out.println("El empleado mas joven es " + menorYmayor[0]);
        System.out.println("El empleado mas viejo es " + menorYmayor[1]);
        System.out.println();

        Empleado[] RicoyPobre = getPoorestAndRichest(empleados);
        System.out.println("El empleado mas pobre es " + RicoyPobre[0]);
        System.out.println("El empleado mas rico es " + RicoyPobre[1]);
        System.out.println();
        eString.close();
    }

    public static Empleado[] getPoorestAndRichest(ArrayList<Empleado> empleados) {
        Empleado[] RicoyPobre = new Empleado[2];
        Empleado pobre = empleados.get(0), rico = empleados.get(0);
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).sueldo > rico.sueldo) {
                rico = empleados.get(i);
            }
            if (empleados.get(i).sueldo < pobre.sueldo) {
                pobre = empleados.get(i);
            }
        }
        RicoyPobre[0] = pobre;
        RicoyPobre[1] = rico;
        return RicoyPobre;
    }

    public static Empleado[] getOlderAndYoungerEmpleado(ArrayList<Empleado> empleados) {
        Empleado[] menorYmayor = new Empleado[2];
        Empleado joven = empleados.get(0), viejo = empleados.get(0);
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getEdad() > viejo.getEdad()) {
                viejo = empleados.get(i);
            }
            if (empleados.get(i).getEdad() < joven.getEdad()) {
                joven = empleados.get(i);
            }
        }

        menorYmayor[0] = joven;
        menorYmayor[1] = viejo;

        return menorYmayor;
    }

    public static ArrayList<Empleado> LeerArchivoPorLineas(String filename) {
        String line = null;
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(reader);

            while ((line = buffer.readLine()) != null) {
                Empleado emp = createEmpleadoFromString(line);
                empleados.add(emp);
            }

            buffer.close();

        } catch (FileNotFoundException emp) {
            emp.printStackTrace();
        } catch (Error emp) {
            emp.printStackTrace();
        } catch (IOException emp) {
            emp.printStackTrace();
        }
        return empleados;
    }

    public static Empleado createEmpleadoFromString(String empleadoString) {

        String[] campos = empleadoString.split(",");
        String nombre = campos[0];
        String apellido = campos[1];
        LocalDate fechaNacimiento = parseFecha(campos[2]);
        double sueldo = parseSueldo(campos[3]);

        Empleado emp = new Empleado(nombre, apellido, fechaNacimiento, sueldo);
        return emp;
    }

    public static LocalDate parseFecha(String fechaString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);
        return fecha;
    }

    public static double parseSueldo(String sueldoString) {
        return Double.parseDouble(sueldoString);
    }

    public static Empleado[] EmpleadoWithLetterOnLastname(String letra, ArrayList<Empleado> empleados) {
        Empleado[] empleadosMatch = new Empleado[empleados.size()];
        int j = 0;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).apellido.toUpperCase().startsWith(letra.toUpperCase())) {
                empleadosMatch[j] = empleados.get(i);
                j++;
            }
        }
        return empleadosMatch;
    }

}
