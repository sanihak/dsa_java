import java.util.Scanner;

public class spiral2 {
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static int[][] Sparse(int n){
        int matrix[][] = new int[n][n];
        int topRow =0;
        int botRow = n - 1;
        int leftcol = 0;
        int rightcol = n-1;
        int curr = 1;
        while(curr<=n*n){

        

        for(int j=leftcol;j<=rightcol && curr<=n*n;j++){
            matrix[topRow][j] = curr++;
            
        }
        topRow++;

        for(int i=topRow;i<=botRow && curr<=n*n;i++){
            matrix[i][rightcol] = curr++;
            
            

        }
        rightcol--;


        for(int j=rightcol;j>=leftcol && curr<=n*n;j--){
            matrix[botRow][j] = curr++;
           
            
        }
        botRow--;
        for(int i=botRow;i>=topRow && curr<=n*n;i--){
            matrix[i][leftcol] = curr++;
           
            
        }
        leftcol++;
        
    }
    return matrix;
    
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();
    int[][] matrix = Sparse(n);
    printarray(matrix);

}
    
}
