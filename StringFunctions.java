import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.bind.PrintConversionEvent;

public class StringFunctions {
    public static void subString(String str1,int a,int b){
         //for sub string finder at index (0,5)
    String subStr="";
    for(int i=a;i<b;i++){
        subStr+=str1.charAt(i);
    }    
    System.out.println(subStr);
        
    }
    public static void compare(String str2[]){
        //to find the larjest string using lexicographical order
        String largest=str2[0];
        for(int i=0;i<str2.length;i++){
            if(largest.compareTo(str2[i])<0){
                largest=str2[i];
            }
        }
        System.out.println("the lagest sting is "+largest);
    }
    
    public static void main(String[] args) {
        String str1="Hello World";
        subString(str1,0, 5);
        //inbuilt function
        System.out.println(str1.substring(0,5));
        //LEXICO GRAFICAL COMPARITION 
        String str2[]={"aaabcd","aaabce","banana"};
        compare(str2);
   
    
}
}
