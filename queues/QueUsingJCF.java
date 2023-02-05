package queues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class QueUsingJCF {
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
