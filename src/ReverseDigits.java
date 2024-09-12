import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the number ");
        int a = sc.nextInt();
        int rev=  reverseDigit(a);
        System.out.println("Reverse value "+rev);
    }
    public static int reverseDigit(int a){
        int rev =0;
        int i=1;
        while(i<=a) {
            int d = a % 10;
            rev = rev*10 + d ;
            a /= 10;
        }
        return rev;
    }
}
