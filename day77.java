import java.util.Arrays;

class day77 {

    static int[] productExceptSelf(int[] arr){

        int[] result = new int[arr.length];
        int countZero = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        if(countZero>1){
            return result;
        }

        int mul = 1;
            
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                mul = mul*arr[i];
            }
        }
        
        if(countZero==1){

            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    result[i]=mul;
                }
            }
        }else{
            for(int i=0;i<arr.length;i++){
                result[i]=mul/arr[i];
            }
        }

        return result;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {-1,1,0,-3,3};

        int[] ans1 = productExceptSelf(arr1);
        int[] ans2 = productExceptSelf(arr2);

        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }
}
