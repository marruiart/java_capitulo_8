
/**
 * Este programa pasa de binario a decimal
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

import maths.General;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número binario: ");
        int binary = s.nextInt();
        s.close();
        long decimal = 0;
        int i = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            if (lastDigit == 1)
                decimal += General.power(2, i);
            binary /= 10;
            i++;
        }
        System.out.print(decimal);
    }
}