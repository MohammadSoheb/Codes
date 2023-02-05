import java.lang.annotation.Target;

public class pairSum2 {
   public static void pairSum2OptimalAproach(int arr[],int Target){
        int k=0,Rp=0,Lp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){//breaking point
                k=i;
                break;
            }
        }
        Rp=k;//big value
        Lp=(k+1);//small value
        while(Rp!=Lp){
            if((arr[Rp]+arr[Lp])==Target){
                System.out.println("True");
                return;
            }
            if((arr[Rp]+arr[Lp])<Target){
                Lp=(Lp+1)%(arr.length-1);
            }
            else{
                Rp=((arr.length-1)+Rp-1)%(arr.length-1);
            }
        }
        System.out.println("False");
    }
    public static void main(String[] args) {
        //SORTED AND ROTATED ARRAY 
        int arr[]={11,15,6,7,8,9,10},Target=16;
        pairSum2OptimalAproach(arr,Target);
    }
    
}
