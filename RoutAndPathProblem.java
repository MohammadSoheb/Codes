import javax.sound.sampled.SourceDataLine;

public class RoutAndPathProblem {
    public static void main(String[] args) {
        String Route="WNEENESENNN";
    //INITIAL AT (0,0)
    int x=0,y=0;
    for(int i=0;i<Route.length();i++){
        if(Route.charAt(i)=='W'){
            x=x-1;
        }
        else if(Route.charAt(i)=='E'){
            x=x+1;
        }
        if(Route.charAt(i)=='N'){
            y=y+1;
        }
        if(Route.charAt(i)=='S'){
            y=y-1;
        }
    }
    int a=(x-0)*(x-0);
    int b=(y-0)*(y-0);
    int c=a+b;
    double slop=Math.sqrt(c);
    System.out.println("the shortest distance is="+slop);
        
    }
    
}
