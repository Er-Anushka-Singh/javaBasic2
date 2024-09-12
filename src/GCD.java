import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int first = sc.nextInt();
        System.out.println("the number is "+first);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number ");
        int second = sc1.nextInt();
        System.out.println("the number is "+second);
        int gcd = gcd(first , second);
        System.out.println("GCD number is "+gcd);
    }
    public static int gcd(int num1,int num2){
       int i=2;
       int gcd =1;
       int least = least(num1,num2);
       while(i<=least){
           int factor;
           if(num1%i==0 && num2%i==0){
             gcd = i;
           }
           i++;
       }

        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1>num2){
           return num1;
        }
        else{
            return num2;
        }
    }
}
