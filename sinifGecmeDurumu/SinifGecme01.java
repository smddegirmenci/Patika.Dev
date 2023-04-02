package sinifGecmeDurumu;

import java.util.Scanner;

public class SinifGecme01 {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int dersSayisi = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.println("Turkce notunuz : ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.println("Muzik notunuz : ");
        muzik = input.nextInt();
        if (mat < 0 || mat > 100) {
            dersSayisi--;
            mat = 0;
        }
        if (fizik < 0 || fizik > 100) {
            dersSayisi--;
            fizik = 0;
        }
        if (turkce < 0 || turkce > 100) {
            dersSayisi--;
            turkce = 0;
        }
        if (kimya < 0 || kimya > 100) {
            dersSayisi--;
            kimya = 0;
        }
        if (muzik < 0 || muzik > 100) {
            dersSayisi--;
            muzik = 0;
        }
        double avarage = (mat + fizik + kimya + turkce + muzik) / dersSayisi;
        if (avarage <= 55) {
            System.out.println("Sinifta kaldiniz");
        } else {
            System.out.println("Tebrikler sinifi gectiniz");
        }
        System.out.println("Ortalamaniz : " + avarage);

    }
}
