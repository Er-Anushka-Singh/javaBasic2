import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        int x=1;
        while(x<=10){
            System.out.println(a+" X "+x+" = "+a*x);
            x++;
        }
    }
}
