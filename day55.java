class Day55 {

    static boolean isMonotonic(int[] nums){
        boolean isIncreasing = false;
        boolean isDecreasing = false;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                isIncreasing = true;
            }
            else if(nums[i]>nums[i+1]){
                isDecreasing = true;
            }
            if(isIncreasing==true && isDecreasing==true){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] n1 = {1,2,2,3};
        int[] n2 = {6,5,4,4};
        int[] n3 = {1,3,2};

        System.out.println(isMonotonic(n1));
        System.out.println(isMonotonic(n2));
        System.out.println(isMonotonic(n3));
    }
}
