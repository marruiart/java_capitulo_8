
/**
 * Este programa convierte un número entre cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;
import comp.mruizar.maths.*;

public class Ejercicio19 {

    public static void converDecimalToBase(long num10, int base) {
        int[] numBase = new int[19];
        int i = 0;
        while (num10 > 0) {
            numBase[i] = (int) (num10 % base);
            num10 /= base;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            if (numBase[j] >= 10)
                System.out.print((char) (numBase[j] + 87));
            else
                System.out.print(numBase[j]);
        }
    }

    public static void converFromBaseToDecimal(long numBase, int base, int convertBase) {
        long num10 = 0;
        int i = 0;
        while (numBase > 0) {
            int lastDigit = (int) (numBase % 10);
            num10 += (General.potencia(base, i) * lastDigit);
            numBase /= 10;
            i++;
        }
        if (convertBase != 10)
            converDecimalToBase(num10, convertBase);
        else
            System.out.print(num10);
    }

    public static void hexToDecimal(String num16, int convertBase) {
        long num10 = 0;
        for (int i = 0; i < num16.length(); i++) {
            char c = num16.charAt(i);
            int charNum = (c >= 'a' && c <= 'f') ? (int) (c - 87) : (int) (c - '0');
            num10 += General.potencia(16, (num16.length() - i - 1)) * charNum;
        }
        if (convertBase == 10)
            System.out.print(num10);
        else
            converDecimalToBase(num10, convertBase);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("2-Binario \n8-Octal \n10-Decimal \n16-Hexadecimal\n");
        System.out.print("Base del número original: ");
        int originalBase = s.nextInt();
        System.out.print("Base a la que convertir el número: ");
        int convertBase = s.nextInt();
        System.out.print("Por favor, introduce el número: ");
        if (originalBase == 16) {
            String num16 = s.next();
            s.close();
            hexToDecimal(num16, convertBase);
        } else {
            long num = s.nextLong();
            s.close();
            if (originalBase == 10)
                converDecimalToBase(num, convertBase);
            else
                converFromBaseToDecimal(num, originalBase, convertBase);
        }
    }
}