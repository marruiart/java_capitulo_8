
/**
 * Este programa genera los n primeros términos de la sucesión look
 * and say. El primer término es 1. A continuación se va leyendo - un uno - por
 * tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
 * 
 * @author: Marina Ruiz Artacho
 **/

import arrays.Array;

public class Ejercicio50 {

    public static void main(String[] args) {
        int[] a = { 4, 3 };
        int[] b = { 7, 8, 9, 10 };
        int[] mixedArray = Array.mezcla(a, b);
        for (int i = 0; i < mixedArray.length; i++)
            System.out.printf("%d ", mixedArray[i]);
    }
}
