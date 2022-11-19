
/**
 * Este programa comprueba que la función aleatorioDeArray funciona. Genera 10 
 * arrays aleatorios, los imprime y los pasa a la función aleatorioDePrueba, 
 * sacando por pantalla el número que esta obtiene de cada array.
 * 
 * @author: Marina Ruiz Artacho
 **/

import arrays.Array;

public class Ejercicio52 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int[] a = Array.generaArrayInt(10, 2, 100);
            System.out.printf("Array %d: ", i);
            for (int j = 0; j < a.length; j++)
                System.out.printf("%d ", a[j]);
            System.out.printf("\nUn número aleatorio del array %d es: %d\n\n", i, Array.aleatorioDeArray(a));
        }
    }
}
