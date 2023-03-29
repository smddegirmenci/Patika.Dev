package daireninAlaniniveCevresiniHesaplayanProgram;

import java.util.Scanner;

public class DaireninCevresiVeAlani {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz ");
        r= scan.nextInt();
        System.out.println("Daire diliminin merkez acisinin olcusunu giriniz");
        a= scan.nextInt();
        double alan= pi*r*r;
        double cevre = 2*pi*r;
        double daireDilimininAlani = (pi*r*r*a)/360;
        System.out.println("Dairenin alani : "+alan);
        System.out.println("Dairenin cevresi : "+cevre);
        System.out.println("Daire diliminin alani : "+daireDilimininAlani);


    }

}
