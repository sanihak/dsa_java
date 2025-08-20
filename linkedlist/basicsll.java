package linkedlist;

public class basicsll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // System.out.println(a.data);
        // now here a is pointed to B , now if i want to print the point the 
        // value present in b by using a then
        // System.out.println(a.next.data);
        

        // when we know the size
        // Node temp=a;
        // for(int i=1;i<=5;i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;

        // }

        
        Node temp = a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }



       
       
        
       


    }
    
}
