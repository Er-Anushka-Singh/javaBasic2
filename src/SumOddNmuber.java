import java.util.Scanner;

public class SumOddNmuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        int sum = odd(a);
        System.out.println("OddSum " + a + " is: " + sum);
        }

        public static int odd(int a){
        int sum =0;
        int i=1;
        while(i<=a){
            sum += i;
            i+=2;
        }
        return sum;
        }

    }

