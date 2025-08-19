package arraylists;
import java.util.ArrayList;
// public class maximum {
//     public static int findmaximum(int arr[]){
//         int max = arr[0];
//         int n = arr.length;
//         for(int i = 1;i<n;i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//             return max;

//         }

    
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         System.out.println(findmaximum(arr));
//     }
// }

public class maximum {
    public static void main(String args[]){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        int max = lists.get(0);
        for(int i =1;i<lists.size();i++){
            if(lists.get(i) > max){
                max = lists.get(i);
            }

        }
        System.out.println(max);

    }
}



