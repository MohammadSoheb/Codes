public class CompressBigStringToSmall {
    public static void compress(String str){
        String sb="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb+=str.charAt(i);
            if(count>1){
                sb+=count.toString();
            }
            
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="aaabbbc";
        //a3b3c3
        //str=abc then abc but not a1b1c1 
        compress(str);

    }
}
