import org.omg.CORBA.Current;

public class ContinerWithMostWater {
    public static void OptimalApproach(int height[]){
        //TWO POINTERT APPROACH
        int Lp=0,Rp=height.length-1,width,heightLine,currentWater;
        int maxWater=Integer.MIN_VALUE;
        while(Lp<Rp){
            width=Rp-Lp;
            heightLine=Math.min(height[Lp], height[Rp]);
            currentWater=width*heightLine;
            if(currentWater>maxWater){
                maxWater=currentWater;
            }
            if(height[Lp]<height[Rp]){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        System.out.println("the container with most water is="+maxWater);

    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7},width,heightLine;
        int currentWater,maxWater=Integer.MIN_VALUE;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                width=j-i;
                heightLine=Math.min(height[i], height[j]);
                currentWater=width*heightLine;
                if(currentWater>maxWater){
                    maxWater=currentWater;
                }

            }
        }
        System.out.println("the max water that stores in this container is="+maxWater);
        OptimalApproach(height);
    }
    
}
