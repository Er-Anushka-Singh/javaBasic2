import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to palindrome identifier code");
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Yes! it is palindrome");
        }
        else{
            System.out.println("No! not a palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int numCopy=num;
        int rev =0;
        while(num>0){
            int d = num%10;
            rev = rev*10 + d;
            num/=10;
        }
        return rev==numCopy;
    }
}
