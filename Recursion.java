public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        factorial(n-1);
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void printDecWhenReverseCalling(int i,int n){
        if(i>n){
            return;
        }
        printDecWhenReverseCalling(i+1, n);
        System.out.print(i);
    }
    public static void main(String[] args) {
        printDec(10);
        printInc(10);
        int fact=factorial(5);
        System.out.println(fact);
        printDecWhenReverseCalling(1,10);
    }
    
}
