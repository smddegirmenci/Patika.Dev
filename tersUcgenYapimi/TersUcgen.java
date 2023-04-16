package tersUcgenYapimi;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak Sayısı : ");
        int sayi = scan.nextInt();
        for (int i = sayi; i >0 ; i--) {
            System.out.print(" ".repeat(sayi-i));
            System.out.println("*".repeat(i*2-1));
//            for (int j = 0; j <sayi-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        }

    }
}
