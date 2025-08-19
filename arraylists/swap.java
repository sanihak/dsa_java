package arraylists;
import java.util.ArrayList;

public class swap {
    
    public static void main(String args[]){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(2);
        lists.add(5);
        lists.add(9);
        lists.add(3);
        lists.add(6);

        int idx1 = 1;
        int idx2 = 3;
        int temp = lists.get(idx1);
        lists.set(idx1,lists.get(idx2));
        lists.set(idx2,temp);
        System.out.println(lists);

        





    }
}

