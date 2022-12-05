import comp.mruizar.maths.General;

public class Voltea {
    public static void main (String[] args) {
        System.out.println(General.voltea(123456789534564l));
        int x = 1234321;
        System.out.println(General.voltea(x));
        if (General.esCapicua(x))
        System.out.println(x + " es capicúa");
        else
        System.out.println(x + " no es capicúa");
    }
}
