import java.util.Scanner;

public class sparsematrix {
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void Sparse(int arr[][] , int r , int c){
        int topRow =0;
        int botRow = r - 1;
        int leftcol = 0;
        int rightcol = c-1;
        int totalElements = 0;
        while(totalElements<r*c){

        

        for(int j=leftcol;j<=rightcol && totalElements<r*c;j++){
            System.out.print(arr[topRow][j] + " ");
            
            totalElements++;
        }
        topRow++;

        for(int i=topRow;i<=botRow && totalElements<r*c;i++){
            System.out.print(arr[i][rightcol] + " ");
            totalElements++;
            

        }
        rightcol--;


        for(int j=rightcol;j>=leftcol && totalElements<r*c;j--){
            System.out.print(arr[botRow][j] +" ");
            totalElements++;
            
        }
        botRow--;
        for(int i=botRow;i>=topRow && totalElements<r*c;i--){
            System.out.print(arr[i][leftcol]+" ");
            totalElements++;
            
        }
        leftcol++;
        
    }
    
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        Sparse(a,r,c);
        
    }
    
}
