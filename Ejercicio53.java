
/**
 * Este programa comprueba que la función nEsimo funciona. Genera un 
 * array bidimensional aleatorio, lo imprime y lo pasa a la función nEsimo,
 * comprobando 10 posiciones y una posición no existente, sacando por 
 * pantalla el número que esta obtiene del array o -1 si no existe.
 * 
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.arrays.Array;
import comp.mruizar.arrays.Bidimensional;

public class Ejercicio53 {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;
        int[][] bidimArray = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            bidimArray[i] = Array.generaArrayInt(columns, 10, 99);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%2d ", bidimArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int position = (int) (Math.random() * (rows * columns));
            System.out.printf("nEsimo (a, %d) devuelve %d\n", position,
                    Bidimensional.nEsimo(bidimArray, position));
        }
        System.out.printf("nEsimo (a, %d) devuelve %d\n", rows * columns,
                Bidimensional.nEsimo(bidimArray, rows * columns));
    }
}
