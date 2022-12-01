
/**
 * Este programa comprueba que la función aleatorioDeArray funciona. Genera 10 
 * arrays aleatorios, los imprime y los pasa a la función aleatorioDePrueba, 
 * sacando por pantalla el número que esta obtiene de cada array.
 * 
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.miscellanea.Miscellanea;

public class Ejercicio54 {

    public static void main(String[] args) {
        int[] digits = { 8, 5, 2, 1, 4, 6 };
        int[] nums = { 4672, 25153, 123456 };
        int[][] a = { { 714, 81, 9, 11 }, { 42, 13, 12345, 4 }, { 6, 66, 666 } };
        String[] aStr = { "{ 714, 81, 9, 11 }", "{ 42, 13, 12345, 4 }", "{ 6, 66, 666 }" };

        int j = 0;
        for (int i = 0; i < digits.length; i++) {
            if (i < 3)
                System.out.printf("Ocurrencias(%d, %d) devuelve %d\n", digits[i], nums[i],
                        Miscellanea.ocurrencias(digits[i], nums[i]));
            else {
                System.out.printf("Si a = %s, ocurrencias(%d, a) devuelve %d\n", aStr[j], digits[i],
                        Miscellanea.ocurrencias(digits[i], a[j++]));
            }

        }
    }
}
