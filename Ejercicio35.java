
/**
 * Este programa llama a una función que convierte el número n al sistema 
 * de palotes y lo devuelve en una cadena de caracteres. Por ejemplo, el 
 * 470213 en decimal es el 
 * | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes. 
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde 
 * la función no se debe mostrar nada por pantalla, solo se debe usar print desde 
 * el programa principal.
 *
 * @author: Marina Ruiz Artacho
 **/

import comp.mruizar.miscellanea.Miscellanea;

public class Ejercicio35 {

    public static void main(String[] args) {
        int n = 470213;
        System.out.print(Miscellanea.convierteEnPalotes(n));
    }
}