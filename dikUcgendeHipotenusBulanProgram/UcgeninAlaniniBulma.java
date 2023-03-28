package dikUcgendeHipotenusBulanProgram;

import java.util.Scanner;

public class UcgeninAlaniniBulma {
    public static void main(String[] args) {
        int a, b, c ;
        double alan,u ;
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ucgenin 1. kenarini giriniz");
        a=input.nextInt();

        System.out.println("Lutfen ucgenin 2. kenarini giriniz");
        b=input.nextInt();

        System.out.println("Lutfen ucgenin 3. kenarini giriniz");
        c=input.nextInt();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani = " + alan);


    }
}
