import java.util.Scanner;

public class prefixsum1 {
    public static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
             System.out.println();
           


        }
        
    }
    public static int rectsum(int matrix[][] , int l1 , int r1 , int l2 , int r2){
        int sum = 0;
        for(int i=l1;i<=l2;i++){
            for(int j = r1;j<=r2;j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and cols : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("enter values for "+(r*c) + "matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("-------------------");
        printmatrix(matrix);
        System.out.println("enter the cordinates:");
       
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        int result = rectsum(matrix, l1, r1, l2, r2);
        System.out.println(result);
        
    }
    
}
