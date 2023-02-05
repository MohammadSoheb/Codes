import java.util.*;
import java.util.Queue;
import java.util.Stack;
public class QueueReversel {
    static void reversal(Queue<Integer> q){
        Stack<Integer> s=new Stack();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);

    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=20;i++){
            q.add(i);
        }
        System.out.println(q);
        reversal(q);
        //System.out.println(q);

    }
    }
    

