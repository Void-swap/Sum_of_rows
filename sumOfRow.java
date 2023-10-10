public class sumOfRow {
    public static void main(String arg[]){
        int array[][]={ {1,4,9},{11,4,3},{2,2,3} };
        int rowNo = 1;
        rowSum(array,rowNo);
    }

    public static void rowSum(int array[][], int rowNo){
        int sum=0;
        for(int column=0 ; column<array[0].length ; column++){
            sum+=array[rowNo][column];  //row is same column increases
        }
        System.out.print(sum);
    }

}
