import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringBuilder {
    public static void main(String[] args) {
        //to create the string builder 
        StringBuilder sb= new StringBuilder();
        sb="a";
        for(char ch='a';ch<='z';ch++){
            sb=sb+ch;


        }
        System.out.println(sb);
    }
    
}
