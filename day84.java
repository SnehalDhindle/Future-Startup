import java.util.Arrays;

class day84 {

    static boolean search(int[] nums,int target){

        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, target);
        return index>=0;

    }
    public static void main(String[] args){
        int[] n1 = {2,5,6,0,0,1,2};
        int[] n2 = {2,2,2,3,2,2,2};
        int t1 = 0;
        int t2 =3;

        System.out.println(search(n1,t1));
        System.out.println(search(n1,t2));
        System.out.println(search(n2,t2));
    }
}

