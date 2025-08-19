package arraylists;
import java.util.*;



public class reverse {
    public static void main(String args[]){
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);

        for(int i = lists.size()-1;i>=0;i--){
            System.out.print(lists.get(i));
        }
        

    }
    
}

