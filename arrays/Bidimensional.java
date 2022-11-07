package arrays;

/**
 * Biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de
 * números enteros.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Bidimensional {

    /**
     * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
     * máxmo) se indica como parámetro.
     * 
     * @param n   número de filas del array
     * @param m   número de columnas del array
     * @param max valor máximo del intervalo de números aleatorios
     * @param min valor mínimo del intervalo de números aleatorios
     * @return array de tamaño n relleno de números aleatorios. Devuelve un array
     *         vacío en caso de error
     **/

    public static int[][] createArrayBiInt(int n, int m, int min, int max) {
        int[][] array = new int[n][m];
        if (min >= max)
            return array;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                array[i][j] = min + (int) (Math.random() * ((max - min) + 1));
        return array;
    }

    /**
     * Devuelve la fila i-ésima del array que se pasa como parámetro.
     * 
     * @param n   número de filas del array
     * @param m   número de columnas del array
     * @param max valor máximo del intervalo de números aleatorios
     * @param min valor mínimo del intervalo de números aleatorios
     * @return array de tamaño n relleno de números aleatorios. Devuelve un array
     *         vacío en caso de error
     **/

    public static int[] rowOfArrayBiInt(int array[][], int i) {
        int[] row = new int[array[i].length];
        for (int j = 0; j < array[i].length; j++)
            row[j] = array[i][j];
        return row;
    }

}
