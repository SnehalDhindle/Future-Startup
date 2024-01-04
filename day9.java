class day9 {

    static int findPeak(int[] nums){
        
        int start = 0;
        int end = nums.length-1;

        for(;start<end;){
            
            int mid = start + (end-start)/2;
            
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        return start;

    }
    public static void main(String[] args){
        
        int[] nums = new int[]{1,2,1,7,6,5,4};
       
        int result = findPeak(nums);
       
        System.out.println("Peak Element is at : " + result);
    }
}
