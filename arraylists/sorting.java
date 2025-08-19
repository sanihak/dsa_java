package arraylists;
import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String args[]){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(2);
        lists.add(5);
        lists.add(9);
        lists.add(3);
        lists.add(6);
        Collections.sort(lists);
        System.out.print(lists);

        Collections.sort(lists,Collections.reverseOrder());)
    }

    
}
