package faktoriyelVeKombinasyonHesabi;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kumenin Eleman Sayisini Giriniz : ");
        int n = scan.nextInt();
        System.out.print("Gruplarin Eleman Sayisini Giriniz : ");
        int r = scan.nextInt();
        int totaln = 1;
        int totalr = 1;
        int totalFark = 1;
        int kombinasyon = 1;
        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }
        for (int i = 1; i <= r; i++) {
            totalr *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            totalFark *= i;
        }
        kombinasyon=totaln/(totalFark*totalr);
        System.out.println("kombinasyon = " + kombinasyon);
    }
}