package yildizlarIleSekilCizmeProgrami;

import java.util.Scanner;

public class YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen basamak sayisini giriniz");
        int n =scan.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <=(2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
