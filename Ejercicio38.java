
/**
 * Este programa llama a una función para obtener los números capicúa 
 * del array pasado por parámetros. las repeticiones de números capicúa 
 * se conservan; es decir, si en el array x el número 505 se repite 3 
 * veces, en el array devuelto también estará repetido 3 veces. 
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.miscellanea.Miscellanea;

public class Ejercicio38 {

    public static void main(String[] args) {
        int[] arraypalindromic = { 313, 4554, 5845, 616, 72 };
        int[] arraynotPalindromic = { 51, 14, -56 };
        int[] palindromic = Miscellanea.filtraCapicuas(arraypalindromic);
        int[] notPalindromic = Miscellanea.filtraCapicuas(arraynotPalindromic);

        System.out.println("Return pasando por parámetros un array de tamaño 5 con 3 números capicúa: ");
        for (int i = 0; i < palindromic.length; i++)
            System.out.printf("%d ", palindromic[i]);
        System.out.println("\nReturn pasando por parámetros un array de tamaño 3 sin ningún número capicúa: ");
        for (int i = 0; i < notPalindromic.length; i++)
            System.out.printf("%d ", notPalindromic[i]);
    }
}
