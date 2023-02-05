

import java.nio.channels.NonWritableChannelException;
import java.util.Stack;

public class QueUsing2StacksJCF {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    static int remove(){
        if(s1.isEmpty()){
            System.out.println("que is empty");
            return -1;
        }
        return s1.pop();
    }
    public static void main(String[] args) {
        add(1);
        add(0);
        add(0);
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
        

    }
}
