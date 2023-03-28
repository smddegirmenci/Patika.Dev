package kdvTutariHesaplayanProgram;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliFiyat;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tutar giriniz");

        tutar = input.nextDouble();
        kdvOran = tutar > 0 && tutar < 1000 ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliFiyat = tutar + kdvTutar;

        System.out.println("KDV Orani = " + kdvOran);
        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        System.out.println("KDV tutari = " + kdvTutar);
    }
}
