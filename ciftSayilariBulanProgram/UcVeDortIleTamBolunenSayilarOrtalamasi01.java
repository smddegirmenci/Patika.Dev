package ciftSayilariBulanProgram;

import java.util.Scanner;

public class UcVeDortIleTamBolunenSayilarOrtalamasi01 {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz : ");
        k = input.nextInt();
        int counter = 0;
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Ortalama : " + 0);
        }else {
            System.out.println("Ortalama : " + (sum / counter));
        }
    }

}
