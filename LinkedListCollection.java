import java.util.LinkedList;
public class LinkedListCollection {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        // print
        System.out.println(ll);
    }
    
}
