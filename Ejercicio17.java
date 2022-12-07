
/**
 * Este programa pasa de binario a decimal
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;
import comp.mruizar.maths.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número binario: ");
        long binary = s.nextLong();
        s.close();
        long decimal = 0;
        int len = General.digitos(binary);
        for (int i = 0; i < len; i++) {
            int lastDigit = General.digitoN(binary, len - 1 - i);
            decimal += (General.potencia(2, i) * lastDigit);
        }
        System.out.print(decimal);
    }
}