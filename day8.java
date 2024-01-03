class Day8 {

    static int singleNum(int[] nums){

        int n = 0;
        for(int i = 0;i<nums.length;i++){
            n = n ^ nums[i];
        }
        
        return n;
        
    }

    public static void main(String[] args){

        int[] nums = new int[]{2,3,1,1,2};

        int result = singleNum(nums);

        System.out.println("Single no. is : " +result);
    } 
}
