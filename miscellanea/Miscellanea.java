package miscellanea;

/**
 * Biblioteca de funciones miscelánea.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Miscellanea {

    /**
     * Ejercicio 35
     * Convierte el número n al sistema de palotes y lo devuelve en una
     * cadena de caracteres.
     * 
     * @param n un número entero
     * @return String del número convertido a palotes.
     **/

    public static String convierteEnPalotes(int n) {
        String sticks = "";
        int length = 0;
        int num = n;
        while (num > 0) {
            length++;
            num /= 10;
        }
        int units = (int) Math.pow(10, length - 1);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < n / units; j++)
                sticks += "|";
            if (i != length - 1)
                sticks += "-";
            n %= units;
            units /= 10;
        }

        return sticks;
    }

    /**
     * Ejercicio 36
     * Devuelve un array con todos los números primos que se encuentren en otro
     * array que se pasa como parámetro.
     * 
     * @param x un array de números enteros
     * @return un array de menor tamaño que el pasado por parámetros. Devuelve un
     *         array con -1 si no encuentra ningún número primo.
     **/

    public static int[] filtraPrimos(int x[]) {
        int[] primesPositions = new int[x.length];
        int countPrimes = 0;
        for (int i = 0; i < x.length; i++) {
            Boolean isPrime = true;
            if (x[i] < 2)
                isPrime = false;
            for (int j = 2; j <= x[i] / 2 && isPrime; j++)
                if (x[i] % j == 0)
                    isPrime = false;

            if (isPrime) {
                primesPositions[countPrimes] = i;
                countPrimes++;
            }
        }
        if (countPrimes == 0) {
            int[] notFound = { -1 };
            return notFound;
        }
        int[] primes = new int[countPrimes];
        for (int i = 0; i < countPrimes; i++)
            primes[i] = x[primesPositions[i]];
        return primes;
    }
}
