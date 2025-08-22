package twodarrray;
import java.util.*;
import java.util.Scanner;

public class multiplication {
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void multiply(int a[][] , int r1,int c1,int b[][], int r2,int c2){
        int mul[][] = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j =0;j<c2;j++){
                for(int k=0;k<c1;k++)
                mul[i][j] = a[i][k] * b[k][j];

            }

        }
        printarray(mul);

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("enter matrix values : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("enter matrix values : ");
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        multiply(a, r1, c1, b, r2, c2);

    }
    
}
