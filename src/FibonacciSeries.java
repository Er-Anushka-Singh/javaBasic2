import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Here is the Fibonacci Series");
         fibonacci(a);

    }
    public static void fibonacci(int a){
        if(a<0) return;
        System.out.print("0 ");
        if(a==0) return;
        System.out.println("1 ");
        int n1=0,n2=1;
        while(n1+n2<=a){
            int n3 = n1+n2;
            System.out.print(n3+ " ");
            n1=n2;
            n2=n3;
        }


    }
}
