import java.util.Arrays;

class Day86 {
    static int[] sortArrayByParity(int[] nums){
        if(nums.length<=1)
            return nums;

        int start = 0;
        int end = nums.length-1;

        while(start<end){
            if(nums[start]%2==0 && nums[end]%2!=0){
                start++;
                end--;
            }else if(nums[start]%2==0 && nums[end]%2==0){
                start++;
            }else if(nums[start]%2!=0 && nums[end]%2!=0){
                end--;
            }else if(nums[start]%2!=0 && nums[end]%2==0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        
        return nums;
    }
    public static void main(String[] args){
        int[] n1 = {2,1,4,5};
        int[] n2 = {2};

        int[] result1 = sortArrayByParity(n1);
        int[] result2 = sortArrayByParity(n2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
