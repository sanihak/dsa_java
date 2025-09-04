import java.util.Scanner;

public class findsum3 {
    //calculate row wise and column wise sum
   public static void findsummatrix(int matrix[][]){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        //vertically traverse to calculate columnwise sum
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }

    }

    public static int findsum(int matrix[][] ,int l1,int r1, int l2 , int r2){
        int ans = 0;

        findsummatrix(matrix);
        int sum=0 , up =0,left =0,leftup = 0;

        
        
        sum = matrix[l2][r2];
        if(l1>=1)
        left = matrix[l2][r1-1];
        if(l1>=1 && r1>=1)
        up = matrix[l1-1][r2];
        if(l1>=1 && r1>=1)
        leftup = matrix[l1-1][r1-1];
        ans = sum-up-left+leftup;
        return ans;
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
