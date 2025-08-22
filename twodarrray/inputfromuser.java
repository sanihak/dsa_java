package twodarrray;
import java.util.*;

public class inputfromuser {
    public static void printarray(int arr[][]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");



            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("enter the number of cols:");
        int c = sc.nextInt();
         int arr[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();

            }
        }
    
       
        printarray(arr);
        sc.close();
    
}
}
