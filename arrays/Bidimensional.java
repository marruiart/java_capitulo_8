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
     * @param array array bidimensional de enteros
     * @param irow  fila que se quiere obtener del array
     * @return array de tamaño n relleno de números aleatorios. Devuelve un array
     *         vacío en caso de error
     **/

    public static int[] rowOfArrayBiInt(int array[][], int irow) {
        int length = array[irow].length;
        int[] row = new int[length];
        for (int j = 0; j < length; j++)
            row[j] = array[irow][j];
        return row;
    }

    /**
     * Devuelve la columna j-ésima del array que se pasa como parámetro.
     * 
     * @param array   array bidimensional de enteros
     * @param jcolumn columna que se quiere obtener del array
     * @return array de tamaño n relleno de números aleatorios. Devuelve un array
     *         vacío en caso de error
     **/

    public static int[] columnOfArrayBiInt(int array[][], int jcolumn) {
        int length = array.length;
        int[] column = new int[length];
        for (int i = 0; i < length; i++)
            for (int j = 0; j < array[i].length; j++)
                column[i] = array[i][jcolumn];
        return column;
    }

    /**
     * Devuelve la fila y la columna (en un array con dos elementos) de la primera
     * ocurrencia de un número dentro de un array bidimensional.
     * 
     * @param array array bidimensional de enteros
     * @param n     número buscado
     * @return un array de dos elementos con la fila y la columna con la primera
     *         posición encontrada en el array bidimensional. Si no se encuentra,
     *         devuelve {-1,-1}
     **/

    public static int[] coordinatesInArrayBiInt(int array[][], int n) {
        int rows = array.length;
        int columns = array[0].length;
        int[] position = { -1, -1 };

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                if (array[i][j] == n) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
        return position;
    }

    /**
     * Dice si un número es o no punto de silla, es decir, mínimo en su fila y
     * máximo en su columna.
     * 
     * @param array  array bidimensional de enteros
     * @param row    posición del número en la fila
     * @param column posición del número en la columna
     * @return <code> true </code> si el número es punto de silla
     *         <code> false </code> si no lo es.
     **/

    public static boolean isiMinjMax(int array[][], int row, int column) {
        int max = Array.maxArrayInt(columnOfArrayBiInt(array, column));
        int min = Array.minArrayInt(rowOfArrayBiInt(array, row));
        boolean isiMinjMax = (array[row][column] == min && array[row][column] == max) ? true : false;
        return isiMinjMax;
    }


}
