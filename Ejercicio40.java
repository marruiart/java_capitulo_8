
/**
 * Este programa llama a una función que devuelve un array con todos los números que
 * contienen el 7 que se encuentren en otro array que se pasa por parámetro.
 * Para que el ejercicio resulte más fácil, las repeticiones de números que contienen
 * 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
 * el array devuelto también estará repetido 3 veces. 
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.miscellanea.Miscellanea;

public class Ejercicio40 {

    public static void main(String[] args) {
        int[] array7 = { 3137, 4554, 5845, 6176, 72, 78954 };
        int[] arrayNot7 = { 51, 14, -56 };
        int[] found7 = Miscellanea.filtraCon7(array7);
        int[] notFound7 = Miscellanea.filtraCon7(arrayNot7);

        for (int i = 0; i < found7.length; i++)
            System.out.printf("%d ", found7[i]);
        System.out.println();
        for (int i = 0; i < notFound7.length; i++)
            System.out.printf("%d ", notFound7[i]);
    }
}
