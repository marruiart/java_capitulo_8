
/**
 * Este programa muestra los números primos que hay entre 1 y 1000
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.maths.General;;

public class Ejercicio15 {
    public static void main(String[] args) {
        long tmp = 0;
        long prime = 0;
        int min = 1;
        int max = 1000;

        for (int i = min; i <= max; i++) {
            tmp = prime;
            prime = General.siguientePrimo(i);
            if (prime != tmp && prime <= max)
                System.out.printf("%d  ", prime);
        }

    }
}