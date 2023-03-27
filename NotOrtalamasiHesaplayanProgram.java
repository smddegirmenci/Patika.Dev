import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        // degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sinifimizi tanimladik
        Scanner inp = new Scanner(System.in);

        // Kullanicidan deger al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamaniz : " + sonuc);

        String durum = sonuc>60?"Sinifi Gectiniz":"Sinifta kaldiniz";
        System.out.println(durum);

    }

}
