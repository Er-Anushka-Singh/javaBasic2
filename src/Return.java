import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first= readNumber();
        int second = readNumber();
        Addition(first,second);
    }
    public static void greet()
    {
        System.out.println("Welcome to calculater");

    }
    public static int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = sc.nextInt();
        return number;
    }
    public static int Addition(int first ,int  second){
        int sum = first +second;
        System.out.println("Sum of number "+sum);
        return sum;

    }
}
