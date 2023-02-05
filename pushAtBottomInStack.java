public class pushAtBottomInStack {
    public static void pushAtBottom(Stack s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.peek();
        s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(03);
        s.push(04);
        int data=5;
        pushAtBottom(s,data);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
