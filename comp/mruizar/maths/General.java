package comp.mruizar.maths;

/**
 * Ejercicios 1 - 14
 * Biblioteca de funciones matemáticas de caracter general.
 *
 * @author: Marina Ruiz Artacho
 **/

public class General {

    /**
     * Devuelve el número de dígitos de un número entero.
     * 
     * @param num un número entero
     * @return la cantidad de dígitos que contiene el número.
     **/

    public static int digitos(long num) {
        if (num < 0)
            num = -num;
        if (num == 0)
            return 1;
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    /**
     * Dada una base y un exponente, devuelve la potencia.
     * 
     * @param base     un número entero que constituye la base
     * @param exponent un número entero que será el exponente
     * @return la potencia de la base elevada al exponente.
     **/

    public static double potencia(double base, int exponent) {
        if (exponent == 0)
            return (double) 1;
        if (exponent < 0) /* Si exponente negativo -> x^(-y) == 1 / (x^y) */
            return (double) (1 / potencia(base, -exponent));
        double x = 1;
        while (exponent-- > 0)
            x *= base;
        return x;
    }

    /**
     * Le da la vuelta a un número y devuelve el número volteado.
     * 
     * @param num un número entero.
     * @return el número {@code long} volteado.
     **/

    public static long voltea(long num) {
        long flippedNumber = 0;
        while (num > 0) {
            long lastDigit = num % 10;
            flippedNumber *= 10;
            flippedNumber += lastDigit;
            num /= 10;
        }
        return flippedNumber;
    }

    public static long voltea(int num) {
        return (voltea((long) num));
    }

    /**
     * Devuelve el dígito que está en la posición n de un número entero. Se empieza
     * contando por el 0 y de izquierda a derecha.
     * 
     * @param num      un número entero.
     * @param position la posición n dentro del número.
     * @return el número que está en la posición n.
     **/

    public static int digitoN(long num, int position) {
        if (position < 0 || position >= digitos(num))
            return -1;
        return (int) (voltea(num) / (long) potencia(10, position)) % 10;
    }

    /**
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero contando desde 0 y de izquierda a derecha.
     * 
     * @param num   un número entero.
     * @param digit el dígito buscado.
     * @return la posición de la primera ocurrencia.
     * @return -1 si no se encuentra.
     * 
     **/

    public static int posicionDeDigito(long num, int digit) {
        num = voltea(num);
        int position = 0;
        while (num > 0) {
            if (num % 10 == digit)
                return position;
            position++;
            num /= 10;
        }
        return -1;
    }

    public static int posicionDeDigito(int num, int digit) {
        return posicionDeDigito((long) num, digit);
    }

    /**
     * Le quita a un número n dígitos por detrás (por la derecha).
     * 
     * @param num     un número entero.
     * @param nDigits número de dígitos a eliminar.
     * @return el número con n dígitos eliminados.
     **/

    public static long quitaPorDetras(long num, int nDigits) {
        for (int i = 0; i < nDigits; i++)
            num /= 10;
        return num;
    }

    /**
     * Le quita a un número n dígitos por delante (por la izquierda).
     * 
     * @param num     un número entero.
     * @param nDigits número de dígitos a eliminar.
     * @return el número {@code long} con n dígitos eliminados.
     **/

    public static long quitaPorDelante(long num, int nDigits) {
        int length = digitos(num);
        double units = potencia(10, length - 1);
        for (int i = 0; i < nDigits; i++) {
            num %= units;
            units /= 10;
        }
        return num;
    }

    /**
     * Añade un dígito a un número por detrás.
     * 
     * @param num   un número entero.
     * @param digit dígito que se va a añadir.
     * @return
     **/

    public static long pegaPorDetras(long num, int digit) {
        num = num * 10 + digit;
        return num;
    }

    /**
     * Añade un dígito a un número por delante.
     * 
     * @param num   un número entero.
     * @param digit dígito que se va a añadir.
     * @return
     **/

    public static long pegaPorDelante(long num, int digit) {
        int lenght = digitos(num);
        double units = potencia(10, lenght);
        num += digit * units;
        return num;
    }

    /**
     * Devuelve el trozo correspondiente de un número desde una posición inicial
     * hasta la final. Las posiciones comienzan en 0.
     * 
     * @param start posición incial (inclusive)
     * @param end   posición final de corte (no inclusive)
     * @return el fragmento del número entre la posición inicial y la final, sin
     *         incluir esta.
     **/

    public static long trozoDeNumero(long num, int start, int end) {
        int lenght = digitos(num);
        double units = potencia(10, lenght - start);
        num %= units;
        units = potencia(10, lenght - end);
        num /= units;
        return num;
    }

    /**
     * Une dos números para formar uno solo.
     * 
     * @param num1 primer número
     * @param num2 segundo número
     * @return devuelve un número formado por los dos números unidos.
     **/

    public static long juntaNumeros(int num1, int num2) {
        int lenght = digitos(num2);
        double units = potencia(10, lenght);
        double joinedNum = num1 * units + num2;
        return (long) joinedNum;
    }

    /**
     * Determina si un número es o no capicúa.
     * 
     * @param num un número entero
     * @return <code> true </code> si es capicúa <code> false </code> si no lo es.
     **/

    public static boolean esCapicua(long num) {
        long flippedNum = voltea(num);
        if (num == flippedNum)
            return true;
        else
            return false;
    }

    public static boolean esCapicua(int num) {
        return (esCapicua((long) num));
    }

    /**
     * Determina si un número es o no primo.
     * 
     * @param num un número entero
     * @return <code> true </code> si es primo <code> false </code> si no lo es.
     **/

    public static boolean esPrimo(long num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static boolean esPrimo(int num) {
        return esPrimo((long) num);
    }

    /**
     * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
     * 
     * @param
     * @return
     **/

    public static long siguientePrimo(long num) {
        while (!esPrimo(++num)) {
        }
        return num;
    }

    public static long siguientePrimo(int num) {
        return siguientePrimo((long) num);
    }

}