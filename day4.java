import java.util.Arrays;
class Day4 {

    public static void main(String[] args){

        int[] arr = {9,9,9};

        int[] result = incrementFun(arr);

        System.out.println("Incrementing by 1: " + Arrays.toString(result));
    }
    
    static int[] incrementFun(int[] arr){

        int n = arr.length-1;

        for(int i = n;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
            }else{
                arr[i]=arr[i]+1;
                return arr;
            }
        }

        arr = new int[arr.length+1];
        arr[0]=1;
        return arr;
    }
}
