package asalSayilar;

public class AsalSayilar01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
