import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        int sum = sumDigit(a);
        System.out.println("Sum of digits "+  sum);
    }
    public static int sumDigit(int a){
        int sum =0;
        while(a>0){
        int d=a%10;
        sum +=d;
        a/=10;
        }
        return sum;
    }
}
