
/**
 * Este programa llama a una función que pinta un valle con montañas 
 * huecas a los lados.
 *
 * @author: Marina Ruiz Artacho
 **/

import arrays.Array;

public class Ejercicio48 {

    public static void main(String[] args) {
        int[] a = { 8, 9, 0 };
        int[] b = { 1, 2, 3 };
        int[] joinedArray = Array.concatena(a, b);

        for (int i = 0; i < joinedArray.length; i++)
            System.out.printf("%d", joinedArray[i]);
    }
}