public class WaterTrapping {
    public static void main(String[] args) {
        int barsHeight[]={4,2,0,6,3,2,5};
        int leftMax[]=new int[10];
        int rightMax[]=new int[10];
        leftMaxFind(leftMax,barsHeight);
        rightMaxFind(rightMax,barsHeight);
        int trapWater=0,waterLevel;
        for(int i=0;i<barsHeight.length;i++){
            waterLevel=min(leftMax[i],rightMax[i]);
            trapWater=trapWater+(waterLevel-barsHeight[i])*1;
        }
        System.out.println("the total trapped water is="+trapWater);
    }
    public static void leftMaxFind(int leftMax[],int barsHeight[]){
        int max;
        for(int i=0;i<barsHeight.length;i++){
            max=barsHeight[i];
            for(int j=i-1;j>=0;j--){
                if(max<barsHeight[j]){
                    max=barsHeight[j];
                }
            }
            leftMax[i]=max;
        }
    }
    public static void rightMaxFind(int rightMax[],int barsHeight[]){
        int max;
        for(int i=0;i<barsHeight.length;i++){
            max=barsHeight[i];
            for(int j=i+1;j<barsHeight.length;j++){
                if(max<barsHeight[j]){
                    max=barsHeight[j];
                }
            }
            rightMax[i]=max;
        }

    }
    public static int min(int left,int right){
        if(left<right){
            return left;
        }
        else{
            return right;
        }
    }
    
}
