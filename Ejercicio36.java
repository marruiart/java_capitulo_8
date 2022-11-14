
/**
 * Este programa llama a una función para filtrar los números primos presentes
 * en un array y los imprime por pantalla. si en el array x el número 13 se
 * repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no
 * existe ningún número primo en x, se devuelve un array con el número -1 como
 * único elemento.
 *
 * @author: Marina Ruiz Artacho
 **/

import miscellanea.Miscellanea;

public class Ejercicio36 {

    public static void main(String[] args) {

        int[] arrayPrimes = { 3, 4, 5, 6, 7 };
        int[] arrayNotPrimes = { 1, 4, -5 };
        int[] primes = Miscellanea.filterPrimes(arrayPrimes);
        int[] notPrimes = Miscellanea.filterPrimes(arrayNotPrimes);

        System.out.println("Return pasando por parámetros un array de tamaño 5 con 3 números primos: ");
        for (int i = 0; i < primes.length; i++)
            System.out.printf("%d ", primes[i]);
        System.out.println("\nReturn pasando por parámetros un array de tamaño 3 sin ningún número primo: ");
        for (int i = 0; i < notPrimes.length; i++)
            System.out.printf("%d ", notPrimes[i]);
    }
}
