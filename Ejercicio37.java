
/**
 * Este programa llama a una función para convertir el número pasado por 
 * parámetros a código morse. A continuación lo imprime por pantalla.
 *
 * @author: Marina Ruiz Artacho
 **/

import miscellanea.Miscellanea;

public class Ejercicio37 {

    public static void main(String[] args) {
        int n = 213;
        String morse = Miscellanea.convierteEnMorse(n);
        System.out.print(morse);
    }
}
