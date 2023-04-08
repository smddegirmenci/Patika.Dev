package faktoriyelVeKombinasyonHesabi;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Faktoriyel Sayisi : ");
        int n =scan.nextInt();
        int total = 1;

        for (int i = 1; i <=n ; i++) {
            total*=i;
        }
        System.out.println(n+" Faktoriyel : "+ total);
    }
}
