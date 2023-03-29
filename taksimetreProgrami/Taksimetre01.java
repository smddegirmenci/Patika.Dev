package taksimetreProgrami;

import java.util.Scanner;

public class Taksimetre01 {


    public static void main(String[] args) {
        int km;
        int startPrice=10;
        double odenecekTutar=10,perkm=2.2;
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen gidilen km'yi giriniz");
        km= input.nextInt();

        odenecekTutar=startPrice+(km*perkm);
        odenecekTutar=odenecekTutar<20 ? 20 :odenecekTutar;
        System.out.println("odenecekTutar = " + odenecekTutar);

    }
}
