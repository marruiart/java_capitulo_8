
/**
 * Este programa pasa de binario a decimal
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número decimal: ");
        long decimal = s.nextLong();
        s.close();
        int[] binary = new int[19];
        int i = 0;
        while (decimal > 0) {
            binary[i] = decimal % 2 == 0 ? 0 : 1;
            i++;
            decimal /= 2;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j]);
    }
}