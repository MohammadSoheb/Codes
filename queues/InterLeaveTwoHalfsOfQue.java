import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class InterLeaveTwoHalfsOfQue {
    static void InterLeave(Queue<Integer> q){
        Queue<Integer> firstHalf=new LinkedList<>();
        int size=q.size();
        int n=size/2;
        for(int i=0;i<n;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=20;i++){
            q.add(i);
        }
        System.out.println(q);
        InterLeave(q);

    }
    
}
