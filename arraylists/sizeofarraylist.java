package arraylists;
import java.util.ArrayList;
import java.util.*;

public class sizeofarraylist {
    public static void main(String args[]){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        System.out.println(lists.size());

        for(int i = 0;i<lists.size(); i++){
            System.out.println(lists.get(i));
        }
        System.out.println();
        

    }
    
}
