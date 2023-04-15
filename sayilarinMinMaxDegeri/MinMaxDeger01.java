package sayilarinMinMaxDegeri;

import java.util.Scanner;

public class MinMaxDeger01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayiAdedi= scan.nextInt();
int max,min,sayi;

if (sayiAdedi>0){
    System.out.print("1. Sayıyı giriniz: ");
    sayi= scan.nextInt();
    max=sayi;
    min=sayi;
    if (sayiAdedi>1){
        for (int i = 2; i <=sayiAdedi ; i++) {
        System.out.print(i+". Sayıyı giriniz: ");
        sayi=scan.nextInt();
        max=Math.max(sayi,max);
        min=Math.min(sayi,min);
        }
    }
    System.out.println("En büyük sayı: "+max);
    System.out.println("En küçük sayı: "+min);
}else {
    System.out.println("Lutfen Pozitif Bir Tam Sayi Giriniz");
}




    }
}
