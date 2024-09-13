public class TwoD_Array {
    public static void main(String[] args) {
        int[][] Myarray= new int[3][2];
        int [][] arr= {{1,2,3},{5,6,7},{4,3,6}};
        System.out.println(arr.length);
        System.out.println(Myarray[0].length);
        // Traversal
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
