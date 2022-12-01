
/**
 * Este programa muestra los números capicúa que hay entre 1 y 99999
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.maths.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        int min = 1;
        int max = 99999;

        for (int i = min; i <= max; i++)
            if (General.esCapicua(i))
                System.out.printf("%d ", i);
    }
}