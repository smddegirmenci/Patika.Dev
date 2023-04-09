package usluSayiHesaplayanProgram;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int n,k,mutiply=1;
        Scanner input =new Scanner(System.in);
        System.out.println("Ussu alinacak sayi : ");
        n= input.nextInt();
        System.out.println("Us olacak sayi : ");
        k= input.nextInt();

        for (int i = 1; i <=k ; i++) {
            mutiply*=n;
        }
        System.out.println("Sonuc = " + mutiply);
    }
}
