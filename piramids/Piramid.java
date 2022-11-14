package piramids;

public class Piramid {

    /**
     * Imprime una línea de x veces el caracter especificado en parámetros.
     * 
     * @param character un caracter que será impreso en pantalla
     * @param x         un número entero que indicará la longitud de la línea
     **/

    public static void linea(char character, int x) {
        for (int i = 0; i < x; i++)
            System.out.print(character);
    }

    /**
     * Imprime una pirámide pegada a la izquierda.
     * 
     * @param character el caracter del borde de la pirámide
     * @param fillChar  el caracter de relleno de la pirámide
     * @param height    la altura de la pirámide
     **/

    public static void piramideInvertidaIzquierda(char character, char fillChar, int height) {
        if (height <= 0) {
            System.out.print("Altura incorrecta");
            return;
        }
        for (int i = height; i > 0; i--) {
            if (i == height || i == 1)
                linea(character, i);
            else {
                System.out.print(character);
                linea(fillChar, i - 2);
                System.out.print(character);
            }
            System.out.println();
        }
    }

    /**
     * Imprime una pirámide pegada a la derecha.
     * 
     * @param character el caracter del borde de la pirámide
     * @param fillChar  el caracter de relleno de la pirámide
     * @param height    la altura de la pirámide
     **/

    public static void piramideInvertidaDerecha(char character, char fillChar, int height) {
        if (height <= 0) {
            System.out.print("Altura incorrecta");
            return;
        }
        for (int i = height; i > 0; i--) {
            linea(' ', height - i);
            if (i == height || i == 1)
                linea(character, i);
            else {
                System.out.print(character);
                linea(fillChar, i - 2);
                System.out.print(character);
            }
            System.out.println();
        }
    }

    /**
     * Imprime un valle con dos montañas a los lados.
     * 
     * @param character el caracter del borde de las montañas
     * @param fillChar  el caracter de relleno de las montañas
     * @param height    la altura de las montañas mayor o igual a 3
     **/

    public static void valle(char character, char fillChar, int height) {
        if (height < 3) {
            System.out.print("Altura incorrecta");
            return;
        }
        for (int i = 1; i <= height; i++) {
            if (i == height)
                linea('*', height * 2 - 1);
            else if (i == 1) {
                System.out.print(character);
                linea(' ', (height * 2 - 1) - i * 2);
                System.out.print(character);
            } else {
                System.out.print(character);
                linea(fillChar, i - 2);
                System.out.print(character);
                linea(' ', (height * 2 - 1) - i * 2);
                System.out.print(character);
                linea(fillChar, i - 2);
                System.out.print(character);
            }
            System.out.println();
        }
    }

}
