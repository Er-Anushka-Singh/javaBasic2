
public class Function {
    public static void main(String[] args) {

        greeting();
      //  printFirstPartten();
        printSecondPartten();
    }
    public static void greeting(){
        System.out.println("Good morning Welcome to coding world");
    }

    public static void printFirstPartten(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
    public static void printSecondPartten(){
        int rows =0;
        while(rows<=5){
            System.out.print("* ");
            int coloum =0;
            while(coloum<rows){
                System.out.print("* ");
                coloum++;
            }
            System.out.println();
            rows++;
        }
    }
}