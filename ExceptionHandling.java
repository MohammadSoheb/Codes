import java.util.Scanner;

import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        int a=100;
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        try{
            System.out.println("the result is=:"+a/b);
        }
        catch(Exception e){
            System.out.println("the exception occored is:"+e);
        }
        System.out.println("progame executes succsesfull");
        
        


    }
    
}
