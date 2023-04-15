package artikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int yil=scan.nextInt();
        String artikyil="";

        if (yil%100==0){
            artikyil=yil%400==0?" bir artık yıldır !":" bir artık yıldır değildir !";
        }else {
            artikyil=yil%4==0?" bir artık yıldır !":" bir artık yıldır değildir !";
        }
        System.out.print(yil + artikyil);
        
    }
}
