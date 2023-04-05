package ciftSayilariBulanProgram;

import java.util.Scanner;

public class CiftSayilariBulanProgram01 {
    public static void main(String[] args) {

        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz : ");
        k = input.nextInt();
        int i = 0;
        while (i <= k) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
