package amstrongSayi;

import java.util.Scanner;

public class AmstrongSayiBulanProgram {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Sayi giriniz : ");
//        int number = input.nextInt();
//        int basNumber = 0;
//        int tempNumber = number;
//        int basValue;
//        int result = 0;
//        int basPow;
//
//        while (tempNumber != 0) {
//            tempNumber /= 10;
//            basNumber++;
//        }
//        tempNumber = number;
//        while (tempNumber != 0) {
//
//            basValue = tempNumber % 10;
//            basPow = 1;
//
//            for (int i = 1; i <= basNumber; i++) {
//                basPow *= basValue;
//            }
//            result += basPow;
//            tempNumber /= 10;
//
//        }
//        if (result == number) {
//            System.out.println(number + " sayisi bir Armstrong sayidir.");
//        } else {
//            System.out.println(number + " sayisi bir Armstrong sayisi degildir.");
//
//        }
//    }

    // Uc basamakli Armstrong sayilar
    public static void main(String[] args) {


        for (int number = 100; number <= 999; number++) {

            int basNumber = 0;
            int tempNumber = number;
            int basValue;
            int result = 0;
            int basPow;

            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }

            tempNumber = number;
            while (tempNumber != 0) {

                basValue = tempNumber % 10;
                basPow = 1;

                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;

            }
            if (number == result) {
                System.out.println(number);
            }
        }

    }

}