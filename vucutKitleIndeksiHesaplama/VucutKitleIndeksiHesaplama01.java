package vucutKitleIndeksiHesaplama;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama01 {
    public static void main(String[] args) {

        double boy, kilo, indeks;
        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre turunden) giriniz : ");
        boy= scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo=scan.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.print("Vucut Kitle Indeksiniz : " + indeks);



    }
}
