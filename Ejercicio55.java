
/**
 * Este programa comprueba que la función aleatorioDeArray funciona. Genera 10 
 * arrays aleatorios, los imprime y los pasa a la función aleatorioDePrueba, 
 * sacando por pantalla el número que esta obtiene de cada array.
 * 
 * @author: Marina Ruiz Artacho
 **/

import arrays.Array;

public class Ejercicio55 {

    public static void main(String[] args) {
        String[] a = { "casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA" };
        String[] aCopy = Array.sinRepetir(a);

        for (int i = 0; i < aCopy.length; i++)
            if (i == aCopy.length - 1)
                System.out.printf("%s", aCopy[i]);
            else
                System.out.printf("%s, ", aCopy[i]);
    }
}
