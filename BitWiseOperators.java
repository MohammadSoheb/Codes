import javax.sound.sampled.SourceDataLine;
class BitWiseOperations{
    public void evenOrodd(int n){
        if((n&1)==1){
            System.out.println(n+" is odd");
        }
        else{
            System.out.println(n+" is even");
        }
    }
    public void getIthBit(int n,int i){
        int c=1<<i;
        System.out.println(c+" "+(n&c));
        System.out.println("ith bit is="+(n&c));
    }
}

public class BitWiseOperators {
    public static void main(String[] args) {
        int a=5,b=6;
        //FOR BITWISE AND 
        System.out.println("a&b="+(a & b));
        //for or
        System.out.println("a|b="+(a|b));
        //for xor
        System.out.println("a^b="+(a^b));
        //for not
        System.out.println("~a="+(~a));
        BitWiseOperations c=new BitWiseOperations();
        c.evenOrodd(101);
        c.getIthBit(2, 1);
        
    }
   

}
