
/**
 * Este programa rellena un array con 10 números aleatorios comprendidos
 * entre 2 y 100 (ambos incluidos) y que los muestra por pantalla. A
 * continuación, el programa indicará para cada uno de ellos si es un número
 * primo y/o un capicúa.
 * 
 * @author: Marina Ruiz Artacho
 **/

import arrays.Array;
import maths.General;

public class Ejercicio51 {

    public static void main(String[] args) {
        int[] a = Array.generaArrayInt(10, 2, 100);
        for (int i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        for (int i = 0; i < a.length; i++) {
             System.out.printf("El %d %s y %s.\n", a[i], General.esPrimo(i) ? "es primo" : "no es primo",
                    General.esCapicua(a[i]) ? "es capicúa" : "no es capicúa"); 
        }
    }
}
