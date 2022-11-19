package arrays;

/**
 * Ejercicios 29 - 34
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

    public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
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

    public static int[] filaDeArrayBiInt(int array[][], int irow) {
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

    public static int[] columnaDeArrayBiInt(int array[][], int jcolumn) {
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

    public static int[] coordenadasEnArrayBiInt(int array[][], int n) {
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

    public static boolean esPuntoDeSilla(int array[][], int row, int column) {
        int max = Array.maximoArrayInt(columnaDeArrayBiInt(array, column));
        int min = Array.minimoArrayInt(filaDeArrayBiInt(array, row));
        boolean isiMinjMax = (array[row][column] == min && array[row][column] == max) ? true : false;
        return isiMinjMax;
    }

    /**
     * Devuelve un array que contiene una de las diagonales del array bidimensional
     * que se pasa como parámetro. La fila y la columna determinan el número que
     * marcará las dos posibles diagonales dentro del array.
     * 
     * @param array     array bidimensional de enteros
     * @param direction la cadena “nose” indica que se elige la diagonal que va del
     *                  noroeste hacia el sureste, mientras que la cadena “neso”
     *                  indica que se elige la diagonal que va del noreste hacia el
     *                  suroeste.
     * @param row       posición del número en la fila
     * @param column    posición del número en la columna
     * @return un array con los números de la diagonal. En caso de error, devuelve
     *         un array vacío
     **/

    public static int[] diagonal(int array[][], String direction, int row, int column) {
        int rows = array.length;
        int columns = array[0].length;
        int[] diagonal = new int[columns];

        if (!direction.equals("nose") && !direction.equals("neso"))
            return diagonal;
        else {
            int i = 0;
            int j = 0;
            int k = 0;
            int itmp = i;
            if (direction.equals("nose")) {
                if (column - row >= 0)
                    j = column - row;
                else {
                    i = row - column;
                    j = 0;
                }

                while (k < rows - itmp && j < columns && i < rows) {
                    diagonal[k] = array[i][j];
                    j++;
                    i++;
                    k++;
                }
            } else if (direction.equals("neso")) {
                if (column + row < columns)
                    j = column + row;
                else {
                    j = columns - 1;
                    i = row - (columns - column) + 1;
                }
                itmp = i;
                while (k < rows - itmp && j >= 0) {
                    diagonal[k] = array[i][j];
                    j--;
                    i++;
                    k++;
                }
            }

            int[] diagonalLength = new int[k];
            for (i = 0; i < k; i++)
                diagonalLength[i] = diagonal[i];
            return diagonalLength;
        }
    }

    /**
     * Busca el número que hay dentro de un array bidimensional en la posición
     * n-ésima contando de izquierda a derecha y de arriba abajo, como si se
     * estuviera leyendo. El primer elemento es el 0.
     * 
     * @param array    array bidimensional de enteros
     * @param position posición buscada en el array
     * @return un número que se encuentra en la posición n-ésima del array
     *         bidimensional. Retorna -1 si la posición donde se busca no existe en
     *         el array.
     **/

    public static int nEsimo(int[][] array, int position) {
        int num = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (count == position)
                    num = array[i][j];
                count++;
            }
        return num;
    }

}
