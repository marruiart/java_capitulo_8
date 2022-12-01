
/**
 * Este programa comprueba que la función aleatorioDeArray funciona. Genera 10 
 * arrays aleatorios, los imprime y los pasa a la función aleatorioDePrueba, 
 * sacando por pantalla el número que esta obtiene de cada array.
 * 
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.arrays.Bidimensional;

public class Ejercicio56 {

    public static void main(String[] args) {
        int rows = 10;
        int columns = 6;
        int[][] a = Bidimensional.generaArrayBiInt(rows, columns, 10, 99);
        int[] cortex = Bidimensional.corteza(a);
        System.out.print("Si el array bidimensional 'a' es el que se muestra a continuación:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
        System.out.print("\nEl array unidimensional generado por corteza(a) sería el siguiente:\n");
        for (int i = 0; i < cortex.length; i++)
            System.out.printf("%d ", cortex[i]);
    }
}
