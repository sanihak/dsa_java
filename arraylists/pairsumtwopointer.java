package arraylists;

import java.util.ArrayList;

public class pairsumtwopointer {
    public static Boolean pairsum(ArrayList<Integer> list , int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

        if(list.get(rp) > target || list.get(rp) == target){
            rp--;
        }
        else if(list.get(lp) > target || list.get(lp) == target){
            lp++;
        }


            
        }
        return false;
        
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairsum(list,target));
    }
    
}
