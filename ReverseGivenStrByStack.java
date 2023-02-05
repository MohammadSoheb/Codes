import java.util.Stack;
public class ReverseGivenStrByStack {
    public static void ReverseString(String str,Stack<Character> s){
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        String reverseStr="";
        while(!s.isEmpty()){
            reverseStr=reverseStr+s.peek();
            s.pop();
        }
        System.out.println("reverse str is="+reverseStr);
    }
    public static void main(String[] args) {
        Stack<Character> s=new Stack<Character>();
        String str="abcd";
        System.out.println("given str="+str);
        ReverseString(str,s);

    }
    
}
