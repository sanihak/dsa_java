import java.util.Scanner;

public class rotate {
   public static void printarray(int arr[][]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
   }
   public static void inplace(int arr[][] , int r1 , int c1){
    for(int i=0;i<c1;i++){
        for(int j=i;j<r1;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
           
        }
    }
   }
   public static void reverseArray(int arr[]){
    int i =0 ;
    int j = arr.length - 1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
   }
   public static void rotate(int arr[][] , int n){
    //transpose
    //reverse of each row of the transpose matrix
    inplace(arr, n, n);
    for(int i=0;i<n;i++){
        reverseArray(arr[i]);
    }
   }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
            
        }
        printarray(a);

        rotate(a,r1);
        printarray(a);
        
    }
    
    

}
