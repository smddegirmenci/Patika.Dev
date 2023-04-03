package havaSicakliginaGoreEtkinlikOnerme;

import java.util.Scanner;

public class HavaSicakligiEtkinlik01 {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsin...");
        } else if (heat <= 10) {
            System.out.println("Sinemaya gidebilirsin...");
        } else if (heat <= 15) {
            System.out.println("Sinemaye yada piknige gidebilirsin...");
        } else if (heat <= 25) {
            System.out.println("Piknige gidebilirsin...");
        } else {
            System.out.println("Yuzmeye gidebililrsin...");
        }
    }
}
