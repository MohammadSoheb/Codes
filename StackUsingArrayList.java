import java.util.ArrayList;
import java.util.List;
class Stack{
   static  ArrayList<Integer> List=new ArrayList<>();
    public  boolean isEmpty(){
        return List.size()==0;
    }

    public static void push(int data){
        List.add(data);
    }
    public static void pop(){
        int top=List.get(List.size()-1);
        List.remove(List.size()-1);
    }
    public static int peek(){
        return List.get(List.size()-1);
    }
}


public class StackUsingArrayList {
    
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
        
    }
    
}
