import java.util.*;

class RemoveDuplicate {

    static int removeDuplicate(int[] nums){

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
               continue; 
            }else{
                nums[count]=nums[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return count;
    }
    public static void main(String[] args) {
        int[] n1 = {1,1,2};
        int[] n2 = {0,0,1,1,1,2,2,3,3,4,4,5};

        System.out.println(removeDuplicate(n1));
       
        System.out.println(removeDuplicate(n2));

    }
}
