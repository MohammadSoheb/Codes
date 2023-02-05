import java.lang.annotation.Target;
import java.util.ArrayList;

public class PairSum1 {
    public static void pairSum1Aproach(ArrayList<Integer> list,int Target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==Target){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
    public static void pairSum1TwoPointerAproach(ArrayList<Integer> list,int Target){
        int Lp=0,Rp=list.size()-1;
        while(Lp<Rp){
            if((list.get(Lp)+list.get(Rp))==Target){
                System.out.println("true");
                return;
            }
            if((list.get(Lp)+list.get(Rp))>Target){
                Rp--;
            }
            else{
                    Lp++;
                }
            }
        
        System.out.println("false");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int Target=5;
        //pairSum1Aproach(list,Target);
        pairSum1TwoPointerAproach(list, Target);


    }    
}
