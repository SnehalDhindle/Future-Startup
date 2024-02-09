import java.util.HashMap;

class day43 {

    static int sumOfUniqueElement(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

         for(int i=0;i<nums.length;i++){
             if(hm.containsKey(nums[i])){
                 hm.put(nums[i],(hm.get(nums[i]) + 1));
             }else{
                 hm.put(nums[i],1);
             }
         }

         System.out.println(hm.entrySet());

         int sum = 0;

         for(int i : hm.keySet()){
             if(hm.get(i)==1){
                 sum +=i;
             }
         }

         return sum;

    }
    public static void main(String[] args){
        int[] n1 = new int[]{1,2,3,4,5};
        int[] n2 = new int[]{1,1,1,1};

        System.out.println(sumOfUniqueElement(n1));
        System.out.println(sumOfUniqueElement(n2));
    }
}
