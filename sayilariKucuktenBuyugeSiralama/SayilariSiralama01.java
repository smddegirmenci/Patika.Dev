package sayilariKucuktenBuyugeSiralama;

import java.util.Scanner;

public class SayilariSiralama01 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayi : ");
        a = scan.nextInt();
        System.out.println("2. sayi : ");
        b = scan.nextInt();
        System.out.println("3. sayi : ");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<c<a");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("c<a<b");
            } else {
                System.out.println("a<c<b");
            }
        } else {
            if (a > b) {
                System.out.println("b<a<c");
            } else {
                System.out.println("a<b<c");
            }
        }
    }
}
