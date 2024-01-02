import java.util.*;
class Day6 {
    
    void quickSort(int arr[],int start,int end){

        if(start < end){
             
            int pivotIdx =  partition(arr,start,end);

            quickSort(arr,start,pivotIdx-1);
            quickSort(arr,pivotIdx+1,end);
        }
    }

    int partition(int arr[],int start,int end){

        int pivot = arr[end];
        int i = start - 1;

        for(int j = start;j < end;j++){
            
            if(arr[j] <= pivot){
                
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;

        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
    public static void main(String[] args){

        int[] arr = new int[]{2,1,0,2,1,0};
        System.out.println(Arrays.toString(arr));

        Day6 obj = new Day6();
        obj.quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
        
    }
}
