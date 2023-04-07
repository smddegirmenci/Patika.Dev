package girilenSayidanKucuk4ve5inKuvvetleri;

import java.util.Scanner;

public class GirlenDegereKadar4Ve5inKuvvetleri {
    public static void main(String[] args) {

        int n;
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sinir degeri giriniz : ");
        n= scan.nextInt();
        System.out.println(n+" Sayisina kadar 4'un kuvvetleri : ");
        for (int i = 1; i <=n ; i*=4) {
            System.out.println(i);
        }
        System.out.println(n+" Sayisina kadar 5'in kuvvetleri : ");
        for (int i = 1; i <=n ; i*=5) {
            System.out.println(i);
        }



    }



}
