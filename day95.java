import java.util.ArrayList;
import java.util.Arrays;

class Day95 {
    static boolean containsDuplicate(int[] nums){
        if(nums.length==1)
            return false;

        // ArrayList<Integer> al = new ArrayList<Integer>();
       
        // for(int i=0;i<nums.length;i++){
        //     if(al.contains(nums[i]))
        //         return true;
        //     else{
        //         al.add(nums[i]);
        //     }
        // }

        // return false;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};

        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));

    }
}
