package arrays;

/**
 * Ejercicios 20 - 28
 * Biblioteca de funciones para arrays (de una dimensión) de números enteros.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Array {

    /**
     * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
     * máxmo) se indica como parámetro.
     * 
     * @param size tamaño del array
     * @param max  valor máximo del intervalo de números aleatorios
     * @param min  valor mínimo del intervalo de números aleatorios
     * @return array de tamaño n relleno de números aleatorios. Devuelve un array
     *         vacío en caso de error
     **/

    public static int[] generaArrayInt(int size, int min, int max) {
        int[] array = new int[size];
        if (min >= max)
            return array;
        for (int i = 0; i < size; i++)
            array[i] = min + (int) (Math.random() * ((max - min) + 1));
        return array;
    }

    /**
     * Devuelve el mínimo del array que se pasa como parámetro.
     * 
     * @param array un array de enteros
     * @return un entero que indica el mínimo del array.
     **/

    public static int minimoArrayInt(int[] array) {
        int min = (int) Math.pow(2, 32);
        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }

    /**
     * Devuelve el máximo del array que se pasa como parámetro.
     * 
     * @param array un array de enteros
     * @return un entero que indica el máximo del array.
     **/

    public static int maximoArrayInt(int[] array) {
        int max = (int) Math.pow(2, 32) * -1 - 1;
        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    /**
     * Devuelve la media del array que se pasa como parámetro.
     * 
     * @param array un array de enteros
     * @return un float que indica la media de los números del array.
     **/

    public static float mediaArrayInt(int[] array) {
        int sum = 0;
        float average;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        average = (float) sum / array.length;
        return average;
    }

    /**
     * Dice si un número está o no dentro de un array.
     * 
     * @param array un array de enteros
     * @param num   un número entero a buscar en el array
     * @return <code> true </code> si el número se encuentra en el array
     *         <code> false </code> si no se encuentra.
     **/

    public static boolean estaEnArrayInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == num)
                return true;
        return false;
    }

    /**
     * Busca un número en un array y devuelve la posición (el índice) en la que se
     * encuentra.
     * 
     * @param array un array de enteros
     * @param num   un número entero a buscar en el array
     * @return el índice en el que se encuentra el número en el array. -1 si no se
     *         encuentra
     **/

    public static int posicionEnArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == num)
                return i;
        return -1;
    }

    /**
     * Le da la vuelta a un array.
     * 
     * @param array un array de enteros
     * @return el array volteado
     **/

    public static int[] volteaArrayInt(int[] array) {
        int length = array.length;
        int[] flippedArray = new int[length];
        for (int i = 0; i < length; i++)
            flippedArray[length - i - 1] = array[i];
        return flippedArray;
    }

    /**
     * Rota n posiciones a la derecha los números de un array.
     * 
     * @param array un array de enteros
     * @param n     las posiciones a rotar a la derecha
     * @return el array rotado n posiciones a la derecha. Un array vacío si la n es
     *         superior o igual al tamaño del array o un número negativo
     **/

    public static int[] rotaDerechaArrayInt(int[] array, int n) {
        int length = array.length;
        int[] rotatedArray = new int[length];
        if (n >= length || n < 0)
            return rotatedArray;
        int j = n;
        for (int i = 0; i < length; i++) {
            if (j >= length)
                j = 0;
            rotatedArray[j] = array[i];
            j++;
        }
        return rotatedArray;
    }

    /**
     * Rota n posiciones a la izquierda los números de un array.
     * 
     * @param array un array de enteros
     * @param n     las posiciones a rotar a la izquierda
     * @return el array rotado n posiciones a la izquierda. Un array vacío si la n
     *         es superior o igual al tamaño del array o un número negativo
     **/

    public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
        int length = array.length;
        int[] rotatedArray = new int[length];
        if (n >= length || n < 0)
            return rotatedArray;
        int j = n;
        for (int i = 0; i < length; i++) {
            if (j >= length)
                j = 0;
            rotatedArray[i] = array[j];
            j++;
        }
        return rotatedArray;
    }

    /**
     * Esta función toma como parámetro un array que contiene números y devuelve una
     * cadena de caracteres con esos números.
     * 
     * @param a un array de números enteros
     * @return una cadena de caracteres con los números.
     **/

    public static String convierteArrayEnString(int[] a) {
        String numStr = "";
        if (a.length > 0)
            for (int i = 0; i < a.length; i++)
                numStr += a[i];
        return numStr;
    }

    /**
     * Esta función toma dos arrays como parámetros y devuelve un array que es el
     * resultado de concatenar ambos.
     * 
     * @param a primer array de números enteros
     * @param b segundo array de números enteros
     * @return un array resultado de concatenar a y b.
     **/

    public static int[] concatena(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] joinedArray = new int[length];
        int j = 0;
        while (j < a.length) {
            joinedArray[j] = a[j];
            j++;
        }
        for (int i = 0; i < b.length; i++) {
            joinedArray[j] = b[i];
            j++;
        }
        return joinedArray;
    }

    /**
     * Esta función toma dos arrays como parámetros y devuelve un array que es el
     * resultado de mezclar los números de ambos de forma alterna, se coge un número
     * de a, luego de b, luego de a, etc. Los arrays a y b pueden tener longitudes
     * diferentes; por tanto, si se terminan los números de un array se terminan de
     * coger todos los que quedan del otro.
     * 
     * @param a primer array de números enteros
     * @param b segundo array de números enteros
     * @return un array resultado de mezclar a y b.
     **/

    public static int[] mezcla(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;
        int length = aLength + bLength;
        int maxLength = aLength > bLength ? aLength : bLength;
        int[] mixedArray = new int[length];
        int j = 0;
        for (int i = 0; i < maxLength; i++) {
            if (j <= length - maxLength) {
                mixedArray[j++] = a[i];
                mixedArray[j++] = b[i];
            } else
                mixedArray[j++] = aLength > bLength ? a[i] : b[i];
        }
        return mixedArray;
    }

}
