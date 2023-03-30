package manavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami01 {
    public static void main(String[] args) {

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,toplamTutar;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg=input.nextInt();
        System.out.print("Elma  Kaç Kilo ? : ");
        elmaKg=input.nextInt();
        System.out.print("Domates  Kaç Kilo ? : ");
        domatesKg=input.nextInt();
        System.out.print("Muz  Kaç Kilo ? : ");
        muzKg=input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg=input.nextInt();

        toplamTutar=(armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }
}
