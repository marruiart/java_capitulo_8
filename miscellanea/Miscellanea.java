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

    public static String convertToSticks(int n) {
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

}
