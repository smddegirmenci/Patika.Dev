package mukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sum = 0;
        if (sayi > 0) {
            for (int i = 2; i <= sayi; i++) {
                if (sayi % i == 0) {
                    sum += sayi / i;
                } else
                    continue;
            }
            if (sum == sayi) {
                System.out.print(sayi + " Mükemmel sayıdır ");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir");
            }
        } else {
            System.out.println("Lutfen Pozitif Bir Tam Sayi Giriniz!!!");
        }
    }
}
