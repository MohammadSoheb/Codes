import java.util.Stack;
public class StackReverse {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.peek();
        s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.peek();
        s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("before reverse");
        System.out.println(s);
        reverseStack(s);
        System.out.println("after reverse");
        System.out.println(s);
    }
    
}
