import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class MyStack {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
        
    public MyStack() {
       
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}


  

public class leet {
    //MyStack object will be instantiated and called as such:
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        //obj.push(1);
        //int param_2 = obj.pop();
        //int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
    
}
