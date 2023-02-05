import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        Queue<Character> q=new LinkedList<>();
        String str="aabccxb";
        int freec[]=new int[26];
        for(int i=0;i<str.length();i++){
            q.add(str.charAt(i));
            freec[str.charAt(i)-'a']++;
            while(!q.isEmpty() && freec[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
            

        }
    }
    
}
