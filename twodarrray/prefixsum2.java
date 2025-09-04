import java.util.*;
public class prefixsum2 {
    public static void findsummatrix(int matrix[][]){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

    }

    public static int findsum(int matrix[][] ,int l1,int r1, int l2 , int r2){
        int sum = 0;

        findsummatrix(matrix);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
        
            else{
                sum += matrix[i][r2];
            }
           
            
            
        }
        return sum;
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c]; 
        System.out.println("enter" + (r*c) + " values ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
                
            }
        } 
        System.out.println("enter the values of l1 , r1 , l2 , r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int result = findsum(matrix,l1,r1,l2,r2);
        System.out.println(result);

    }
}
    

