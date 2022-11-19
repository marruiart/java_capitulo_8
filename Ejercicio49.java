
/**
 * Este programa genera los n primeros términos de la sucesión look
 * and say. El primer término es 1. A continuación se va leyendo - un uno - por
 * tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
 * 
 * @author: Marina Ruiz Artacho
 **/

import arrays.Array;
import java.util.Scanner;

public class Ejercicio49 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.print("¿Cuántos términos de la sucesión look and say quiere calcular? ");
            n = s.nextInt();
            if (n < 3)
                System.out.println("Número incorrecto");
        } while (n < 3);
        s.close();

        int[] a = { 1 };
        for (int i = 1; i <= n; i++) {
            System.out.print(Array.convierteArrayEnString(a));
            if (i < n)
                System.out.print(", ");
            int[] lookAndSay = {};

            while (a.length > 0) {
                int[] tmp = new int[2];
                tmp[0] = countRepetitions(a);
                tmp[1] = a[0];
                a = cola(a);
                lookAndSay = Array.concatena(lookAndSay, tmp);
            }
            a = lookAndSay.clone();
        }
    }

    public static int countRepetitions(int[] a) {
        int count = 0;
        int i = 0;
        while ((i < a.length) && (a[0] == a[i])) {
            count++;
            i++;
        }
        return count;
    }

    public static int[] cola(int[] a) {
        if (a.length == 0) {
            int[] tmp = {};
            return tmp;
        }
        int repetitions = countRepetitions(a);
        int[] c = new int[a.length - repetitions];
        for (int i = repetitions; i < a.length; i++)
            c[i - repetitions] = a[i];
        return c;
    }

}
