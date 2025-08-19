package arraylists;
import java.util.ArrayList;
public class operations {
    public static void main(String args[]){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(1,9);
        System.out.println(lists);

        //Get operations
         int element = lists.get(2);
         System.out.println(element);

         //delete element
        //  int remove  = lists.remove(2);
        //  System.out.println(remove);
        
         // set
         lists.set(2,10);
         System.out.println(lists);
         //contains
         System.out.println(lists.contains(10));
         System.out.println(lists.contains(11));

    
         
         


    }
    

}

