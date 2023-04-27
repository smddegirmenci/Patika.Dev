package fibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int a = 0, b = 1;
        System.out.print(sayi + " Elemanli Fibonacci Serisi : ");
        System.out.print(a + " ");
        for (int i = 0; i < sayi; i++) {
            a = a + b;
            System.out.print(a + " ");
            b = a - b;
        }
    }
}
