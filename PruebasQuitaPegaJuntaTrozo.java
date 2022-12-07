import comp.mruizar.maths.General;

public class PruebasQuitaPegaJuntaTrozo {
    public static void main(String[] args) {
        System.out.println(General.quitaPorDelante(123456789, 3));
        System.out.println(General.pegaPorDetras(12345, 9));
        System.out.println(General.pegaPorDelante(12345, 9));
        System.out.println(General.juntaNumeros(123, 456));
        System.out.println(General.trozoDeNumero(123456789, 0, 8));
        System.out.println(General.trozoDeNumero(123456789, -1, 8));
        System.out.println(General.trozoDeNumero(123456789, 0, 9));
    }

}
