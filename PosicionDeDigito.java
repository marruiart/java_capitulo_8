import comp.mruizar.maths.General;

public class PosicionDeDigito {
    public static void main (String[] args) {
        System.out.println(General.posicionDeDigito(123456789, 0));
        System.out.println(General.posicionDeDigito(123456789, 1));
        System.out.println(General.posicionDeDigito(123456789, 2));
        System.out.println(General.posicionDeDigito(123456789, 8));
        System.out.println(General.posicionDeDigito(12345689, 7));

    }
}
