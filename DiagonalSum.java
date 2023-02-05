import java.util.Scanner;
public class DiagonalSum{
    public static void diagonalSum(int arr[][]){
        int pd=0,sd=0;//O(n^2) APPROACH
       /*  for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    pd+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sd+=arr[i][j];
                }

            }
        }
        System.out.println(pd+sd);

    } */
    //OPTIMAL APPROACH O(n)
    for(int i=0;i<arr.length;i++){
        //for primary diagonal
        pd+=arr[i][i];
        //for secondary diagonal
        //i+j=n-1 then j=n-1-i
        if(i!=arr.length-1-i){
        sd+=arr[i][arr.length-1-i];
        }
    }
    System.out.println(pd+sd);
}

    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {2,3,4},
                    {6,7,8}};
                    diagonalSum(arr);
        
    }

}