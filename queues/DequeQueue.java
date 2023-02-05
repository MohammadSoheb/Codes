import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class DequeQueue{
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println();
        System.out.println(deque);

    }
}
    

