
/**
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el 
 * | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes. 
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde 
 * la función no se debe mostrar nada por pantalla, solo se debe usar print desde 
 * el programa principal.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio35 {

    /**
     * convierte el número n al sistema de palotes y lo devuelve en una
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

    public static void main(String[] args) {
        int n = 470213;
        System.out.print(convertToSticks(n));
    }
}