import java.util.*;
public class transpose {
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
             System.out.println();

        }
       


    }
    public static void transpose(int a[][] , int r1,int c1){
        int ans[][] = new int[c1][r1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[j][i] = a[i][j]; 

            }
        }
        System.out.println();
        printarray(ans);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1  = sc.nextInt();
        int a[][] = new int[r1][c1];
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
       
        transpose(a, r1, c1);

    }
    
    
}
