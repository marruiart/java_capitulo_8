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
            Boolean isPrime = maths.General.esPrimo(x[i]);
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

    /**
     * Ejercicio 37
     * Convierte un número n al sistema Morse y lo devuelve en una cadena de
     * caracteres.
     * 
     * @param n un número entero
     * @return String del número convertido a morse.
     **/

    public static String convierteEnMorse(int n) {
        String[] morseArray = {
                "_ _ _ _ _ ",
                ". _ _ _ _ ",
                ". . _ _ _ ",
                ". . . _ _ ",
                ". . . . _ ",
                ". . . . . ",
                "_ . . . . ",
                "_ _ . . . ",
                "_ _ _ . . ",
                "_ _ _ _ . ",
        };
        int digits = maths.General.digitos(n);
        String[] numMorseArray = new String[digits];
        for (int i = 0; i < digits; i++) {
            numMorseArray[i] = morseArray[n % 10];
            n /= 10;
        }
        String morse = "";
        for (int i = digits - 1; i >= 0; i--) {
            morse += numMorseArray[i];
        }
        return morse;
    }

    /**
     * Devuelve un array con todos los números capicúa que se encuentren en otro
     * array que se pasa como parámetro. Obviamente el tamaño del array que se
     * devuelve será menor o igual al que se pasa como parámetro.
     * 
     * @param x un array de números enteros
     * @return array de integers con los números capicúa. Si no existe ningún número
     *         capicúa en x, se devuelve un array con el número -1 como único
     *         elemento.
     **/

    public static int[] filtraCapicuas(int x[]) {
        int countPalindromics = 0;
        int[] palindromicsPositions = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            if (maths.General.esCapicua(x[i])) {
                palindromicsPositions[countPalindromics] = i;
                countPalindromics++;
            }
        }
        if (countPalindromics == 0) {
            int[] notFound = { -1 };
            return notFound;
        }
        int[] palindromics = new int[countPalindromics];
        for (int i = 0; i < countPalindromics; i++) {
            palindromics[i] = x[palindromicsPositions[i]];
        }
        return palindromics;
    }

}
