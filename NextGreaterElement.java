import java.util.Stack;
public class NextGreaterElement {
    public static void nextGraterFinder(Stack<Integer> s,int arr[]){
        int nextGraterArr[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGraterArr[i]=-1;
            }
            else{
                nextGraterArr[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int d:nextGraterArr){
            System.out.print(d+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
    Stack<Integer> s=new Stack<>();
    nextGraterFinder(s,arr);
    }
    
    
    
}
////










//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    public static int peek=-1;
    
    public static void push(long x){
        peek++;
        nge[peek]=x;
    }
    public static void pop(){
        peek--;
    }
    public static boolean isEmpty(){
        if(peek==0){
            return true;
        }
        else{
            return false;
        }
    }
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        //Stack<Integer> s=new Stack(LongInteger);
        long s[]=new long[n];
        long nge[]=new long[n];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=s.peek();
            }
            push(s,arr[i]);
        }
        return nge;
        
    } 
   // public static 
}
