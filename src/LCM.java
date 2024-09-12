import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int first = sc.nextInt();
        System.out.println("the number is "+first);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number ");
        int second = sc1.nextInt();
        System.out.println("the number is "+second);
        int lcm =lcm(first,second);
        System.out.println("LCm of two number "+lcm);

    }
    public static int lcm(int first, int second){
        int i = 1;
        while(true){
            int factor = first *i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }

    }
}
