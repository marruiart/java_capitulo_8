
/**
 * Este programa llama a una función que convierte los números de un 
 * array en un String y los imprime por pantalla
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.arrays.Array;

public class Ejercicio47 {

    public static void main(String[] args) {
        int[] numArray = { 6, 2, 5, 0, 1 };
        String numStr = Array.convierteArrayEnString(numArray);
        System.out.print(numStr);
    }
}
