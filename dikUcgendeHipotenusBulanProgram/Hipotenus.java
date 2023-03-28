package dikUcgendeHipotenusBulanProgram;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        int a,b;
        double c;
        Scanner input =new Scanner(System.in);
        System.out.println("1. Kenari giriniz");
        a= input.nextInt();
        System.out.println("2. Kenari giriniz");
        b= input.nextInt();

        c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus = "+c);

    }
}
