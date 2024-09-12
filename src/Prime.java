import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a = sc.nextInt();
        boolean prime= prime(a);
        if(prime){
        System.out.println("Prime number ");}
        else{
            System.out.println("Not! a prime number");
        }
    }

    public static boolean prime(int a){

        int p =2;
        while(p<a){
           if(a%p==0){
              return false;
           }
          p++;
           }
        return true;
        }
    }


