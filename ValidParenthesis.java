import java.util.Stack;
import java.util.*;
public class ValidParenthesis {
    public static boolean check(String input){
        Stack<Character> s=new Stack<>();
        char ch;
        for(int i=0;i<input.length();i++){
            ch=input.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')
                ||(s.peek()=='{' && ch=='}')
                ||(s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String input="({[]}())";
        
        boolean result=check(input);
        System.out.println(result);
    }
    
}
