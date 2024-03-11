import java.util.Arrays;

class RemoveElement {
    static int removeDuplicate(int[] nums , int val){

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
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
        int[] n1 = {};
        int[] n2 = {0,1,2,2,3,0,4,2};

        System.out.println(removeDuplicate(n1,3));
       
        System.out.println(removeDuplicate(n2,2));

    }
}
