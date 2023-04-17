package polindromSayilar;

public class PolindromSayi01 {
    static boolean isPolindrom(int number){
        int temp=number,revereseNumber =0,lastNumber;
        while ((temp !=0)){
            lastNumber=temp%10;
            revereseNumber=(revereseNumber*10)+lastNumber;
            temp/=10;
        }
        if (number==revereseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(4));
    }

}
