import java.util.*;
   
class day78 {
    static int[] intersection(int[] nums1,int[] nums2){

        List<Integer> n1 = new ArrayList<>();
        for (int num : nums1) {
            n1.add(num);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (n1.contains(num) && !intersection.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
        
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
        System.out.println(Arrays.toString(intersection(nums3,nums4)));
    }
}



