import java.util.HashMap;

class day43 {

    static int sumOfUniqueElement(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

         int sum = 0;
         
        for(int i : nums){
            if(hm.get(i)==null){
                hm.put(i,1);
                sum += i;
            }
            else if(hm.get(i)>0){
                sum -= i;
                hm.put(i,0);
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
