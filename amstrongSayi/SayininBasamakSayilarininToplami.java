package amstrongSayi;

import java.util.Scanner;

public class SayininBasamakSayilarininToplami {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int number = scan.nextInt();
        int sum = 0;
        int modulus = 0;
        while (number != 0) {
            modulus = number % 10;
            sum += modulus;

            System.out.print(modulus);
            number /= 10;
            if (number != 0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println(sum);
    }
}
