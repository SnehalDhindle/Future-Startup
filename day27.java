import java.util.Arrays;

class Day27 {

    static int[] applyOperations(int[] nums){


        if(nums.length == 1 || nums.length == 0){
            return nums;
        }

        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1){
                if(nums[i]==nums[i+1]){
                    nums[i]=nums[i]*2;
                    nums[i+1]=0;
                }
            }
        }

            System.out.println(Arrays.toString(nums));

        int nz = 0;
        int z = 0;

        while(nz<nums.length){
            if(nums[nz]!=0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }else{
                nz++;
            }

        }

         return nums;
    }
    public static void main(String[] args){

        int[] num1 = new int[]{847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] num2 = new int[]{0,1};

        int[] result1 = applyOperations(num1);
        int[] result2 = applyOperations(num2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));

    }
}
