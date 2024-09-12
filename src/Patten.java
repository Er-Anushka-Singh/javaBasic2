import java.util.Scanner;

public class Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        pattenFirst(n);
        System.out.println();
        pattenSecond(n);
        System.out.println();
        pattenThird(n);
    }

    public static void pattenFirst(int n) {
        int i = 0;
        while (i <= n) {
            System.out.print("* ");
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattenSecond(int n) {
        int rows = n;
        while (rows >= 0) {
            System.out.print("* ");
            int colum = rows;
            while (0 < colum) {
                System.out.print("* ");
                colum--;
            }
            System.out.println();
            rows--;
        }

    }
    public static void pattenThird(int n){
      int rows = n;
      while(rows>0){
          int j=0;
          while(j<rows-1){
              System.out.print("  ");
              j++;
          }
          int i =0;
          while(i<=(n-rows)){
              System.out.print("* ");
              i++;
          }
          System.out.println();
          rows--;
      }

    }
}
