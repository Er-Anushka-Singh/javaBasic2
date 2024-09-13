public class Array {
    public static void main(String[] args) {
        int [] marks=new int[5];
//        marks[0]=34;
//        marks[1]=24;
//        marks[2]=55;
//        marks[3]=87;
//        marks[4]=31;
        int[] arr={34,24,55,87,31};
  //      int index=2;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[index]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        //Array Traversal
        int index=0;
        while(index<arr.length){
            System.out.println(arr[index]);
            index++;
        }
    }
}
