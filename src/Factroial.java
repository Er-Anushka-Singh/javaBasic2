import java.util.Scanner;

public class Factroial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        long factorial= factorial(a);
        System.out.println("Factorial "+factorial);

    }
    public static long factorial(int a){
        long factorial=1;
        int i=1;
        while(i<=a){
        factorial= factorial*i;
        i++;
        }
        return factorial;
    }
}
