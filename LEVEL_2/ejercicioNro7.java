package LEVEL_2;

import java.util.*;

/**
 * Crear una función que dado 2 argumentos (int, siendo el primero menor al
 * segundo), nos devuelva un array de Strings. Con la secuencia de números
 * enteros de principio a final. Pero si el número es multiplo de 2 colocara el
 * valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos
 * colocara “FizzBuzz”. Observacion: Los 2 argumentos indican con que valor se
 * arranca a calcular y el segundo con qué valor debe frenar (no se incluye en
 * el cálculo) Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 * 
 */
public class ejercicioNro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro1, nro2;
        System.out.println("Ingrese un primer numero: ");
        nro1 = sc.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        while (true) {

            nro2 = sc.nextInt();
            if (nro2 > nro1) {
                break;
            }
            System.out.println("Valor invalido vuelva a ingresar nuevamente");
        }
        String[] arrayFinal = generarArray(nro1, nro2);

        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);
        }
        sc.close();
    }

    // longitud del array
    public static String[] generarArray(int nro1, int nro2) {
        int longitudArray = nro2 - nro1;
        System.out.println(longitudArray);
        String[] arr = new String[longitudArray];
        int j = 0;

        for (int i = nro1; i < nro2; i++) {
            arr[j] = determinarElemento(i);
            j++;

        }
        return arr;
    }

    public static String determinarElemento(int nro) {
        String sc = String.valueOf(nro);
        if (nro % 2 == 0 && nro % 3 == 0) {
            sc = "FizzBuzz";
        } else if (nro % 3 == 0) {
            sc = "Buzz";
        } else if (nro % 2 == 0) {
            sc = "Fizz";
        }
        return sc;
    }
}
