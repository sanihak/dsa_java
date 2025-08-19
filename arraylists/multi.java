package arraylists;

import java.util.ArrayList;

public class multi {
    public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         mainlist.add(list);
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(4);
//         list.add(5);
//         list2.add(6);
//         mainlist.add(list2);

//         for(int i=0;i<mainlist.size();i++){
//             ArrayList<Integer> currlist = mainlist.get(i);
//             for(int j=0;j<currlist.size();j++){
//                 System.out.print(currlist.get(j) + " ");
//             }
//             System.out.println();
            
//         }
//         System.out.println(mainlist);


//     }
    
// }

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainlist.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainlist.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        mainlist.add(list3);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            // System.out.print(currlist);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();

        }
        System.out.println(mainlist);
        





    }
}
