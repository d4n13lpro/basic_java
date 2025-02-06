package GalALit;

public class GalALit {
    public static void main(String[] args) {
        double galones;
        double litros;
        galones = 10;
        litros = galones * 3.784;
        System.out.println(galones + " galones son " + litros +" litros." );
        System.out.println(String.format("%.2f galones son %.2f litros",galones,litros));
    }
}
