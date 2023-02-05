import java.util.Stack;
public class MaxAreaInHistograme {
    public static void maxRectangleArea(int arr[]){
        //FOR NEXT RIGHT SMALLER
        Stack<Integer> s=new Stack<>();
        int nrs[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nrs[i]=-1;
            }
            else{
                nrs[i]=s.peek();
            }
            s.push(arr[i]);
        }
        //FOR REVERSE THE ARRAY
        Stack<Integer> s1=new Stack<>();
        int nls[]=new int[arr.length];
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            s1.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr1[i]=s1.peek();
        }
           
        //FOR NEXT LEFT SMALLER
        
        
        for(int i=arr1.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nls[i]=-1;
            }
            else{
                nls[i]=s.peek();
            }
            s.push(arr[i]);
        }

    }
    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
        maxRectangleArea(height);
    }
    
}
