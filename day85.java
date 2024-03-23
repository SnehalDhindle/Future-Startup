import java.util.ArrayList;
import java.util.Arrays;

class Day85 {
    static void duplicateZeros(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();

        int a;
        
        for(int i=0;i<arr.length;i++){
            a = arr[i];
            if(a==0){
                al.add(a);
                al.add(a);
            }else{
                al.add(a);
            }
        }

        
        Integer[] arr1 = new Integer[arr.length];
        al.subList(0, arr.length).toArray(arr1);

        for(int i=0;i<arr.length;i++){
            arr[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String[] args){
        int[] arr1 = {1,0,2,3,0,4,5,0};
        int[] arr2 = {1,2,3};

        duplicateZeros(arr1);
        duplicateZeros(arr2);
    }    
}
