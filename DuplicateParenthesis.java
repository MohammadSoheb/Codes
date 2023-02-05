import javax.print.DocFlavor.STRING;
import java.util.Stack;
import java.util.WeakHashMap;

public class DuplicateParenthesis {
    public static boolean check(String str){
        char ch;
        int count=0;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='(' || ch=='a' || ch=='b' || ch=='+'){
                s.push(ch);
            }
            else{
                count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="((a+b)+(a))";
        boolean a=check(str);
        System.out.println(a);
    }
    
}
