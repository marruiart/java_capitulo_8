
/**
 * Este programa llama a una función que une dos arrays que
 * se pasan por parámetros e imprime el array combinado.
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.arrays.Array;

public class Ejercicio48 {

    public static void main(String[] args) {
        int[] a = { 8, 9, 0 };
        int[] b = { 1, 2, 3 };
        int[] joinedArray = Array.concatena(a, b);

        for (int i = 0; i < joinedArray.length; i++)
            System.out.printf("%d", joinedArray[i]);
    }
}
