package ebobEkokBulanProgram;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;

        int i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("ebob : " + ebob);
                break;
            }
            i--;
        }

        int k = 1;
        while (k<=n1*n2){
            if (k%n1==0&&k%n2==0){
                System.out.println("ekok : " + k);
                break;
            }
            k++;
        }
    }
}
