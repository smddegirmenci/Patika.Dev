package tekSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner scan =new Scanner(System.in);

        do {
            System.out.println("Sayi giriniz : ");
            n=scan.nextInt();
            if (n%2==1){
                total+=n;
            }
        }while (n>0);

        System.out.println("Toplam : "+total);
    }
}
