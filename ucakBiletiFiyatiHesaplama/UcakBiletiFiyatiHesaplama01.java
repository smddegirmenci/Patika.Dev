package ucakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = scan.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int yas = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz \n(1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scan.nextInt();

        double yasIndirimi, normalTutar, gidisDonusIndirimi, indirimliTutar, toplamTutar;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            normalTutar = mesafe * 0.1;
            if (yas <= 12) {
                yasIndirimi = normalTutar * 0.5;
            } else if (yas <= 24) {
                yasIndirimi = normalTutar * 0.1;
            } else if (yas <= 65) {
                yasIndirimi = 0;
            } else {
                yasIndirimi = normalTutar * 0.3;
            }
            indirimliTutar = normalTutar - yasIndirimi;
            if (yolculukTipi == 2) {
                gidisDonusIndirimi = indirimliTutar * 0.2;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }
            System.out.println("ToplamTutar = " + toplamTutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
