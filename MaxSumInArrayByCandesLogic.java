class MaxSumInArrayByCandesLogic {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        cadensLogic(arr);

    }
    public static void cadensLogic(int arr[]){
        int max=Integer.MIN_VALUE;
        int current_value=0;
        for(int i=0;i<arr.length;i++){
            current_value=arr[i]+current_value;
            if(current_value<0){
                current_value=0;
            }
            if(max<current_value){
                max=current_value;
            }
        }
        System.out.println(max);
    }
    
}
