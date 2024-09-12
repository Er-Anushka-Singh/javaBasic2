import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number");
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        boolean IsArmstrong = IsArmstrong(a);
        if(IsArmstrong){
            System.out.println("Yes! Number is armstrong ");
        }
        else{
            System.out.println("N0! number is armstrong ");
        }
    }
    public static int power(int num1,int num2){
        int result=1;
        int i=0;
        while(i<num2){
            result *=num1;
            i++;
        }
        return result;
    }
    public static int count(int a){
        int digit=0;
        while(a>0){
            digit++;
            a/=10;
        }
        return digit;
    }
    public static boolean IsArmstrong(int a){
        int NoOfDigit=count(a);
        int numcopy=a;
        int finalNumber=0;
        while(a>0){
            int lastDigits = a%10;
            a/=10;
            finalNumber += power(lastDigits,NoOfDigit);
        }
        return finalNumber == numcopy;
    }
}
