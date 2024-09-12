import java.util.Scanner;

public class pattenSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        pattenSecond(num);
    }
    public static void pattenSecond(int n){
        int rows=n;
        while(rows>=0){
            System.out.print("* ");
            int colum = rows;
            while(0<colum){
                System.out.print("* ");
                colum--;
            }
            System.out.println();
            rows--;
        }

    }
}
