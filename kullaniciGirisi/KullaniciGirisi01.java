package kullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi01 {
    public static void main(String[] args) {
        String userName, password, newPasword;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName = input.nextLine();

        System.out.print("Sifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("abc")) {

            System.out.println("Giris Yaptiniz");

        } else if (userName.equals("patika")) {

            System.out.println("Sifreniz yanlis. Sifrenizi sifirlamak istiyorsaniz 1 yada 2 yi tuslayin \n 1:Evet\n 2:Hayir");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Yeni sifre giriniz ");
                    newPasword = input.next();

                    if (newPasword.equals("abc")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
                    break;
                case 2:
                    System.out.println("Lutfen tekrar giris yapiniz");
            }

        } else {
            System.out.println("Bilgileriniz yanlis!");
        }


    }
}

