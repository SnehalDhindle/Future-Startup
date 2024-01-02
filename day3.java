import java.util.*;
class Day3{
    public static void main(String[] args){

        int[] arr = {1,3,5,7};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int result = findEle(arr,target);
        System.out.println("Element is at index: " + result);

        sc.close();
    }

    static int findEle(int[] arr,int target){
        
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>target){
                return i;
            }
            if(arr[i]==target){
                return i;
            }
        }
        
        return 0;
    }
}