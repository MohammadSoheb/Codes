//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.util.LinkedList;
    import java.util.Queue;
  
    // } Driver Code Ends
    
    
    class Solution
    {
        public String FirstNonRepeating(String A)
        {
            // code here
            int freq[]=new int[26];
            char ch;
            String str="";
            Queue<Character> q=new LinkedList<>();
            for(int i=0;i<A.length();i++){
                ch=A.charAt(i);
                freq[ch-'a']=freq[ch-'a']+1;
                q.add(ch);
                //System.out.println(q);
                //System.out.println(freq[ch-'a']);
                while(!q.isEmpty() && freq[q.peek()-'a']>1  ){
                    q.remove();
                }
                //System.out.println(q);
                if(q.isEmpty()){
                    System.out.println("#");
                    //str=str+"#";
                }
                else{
                    System.out.println(q.peek());
                    char ch1=q.peek();
                   // str=str+ch1;
                }
               // System.out.println(q);
                
            }
            return str;
        }
    }
    class Practice{
        public static void main(String[] args) {
            Solution s=new Solution();
            s.FirstNonRepeating("aabccxb");
        }
    }