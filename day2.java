class Day2{
    public static void main(String[] args){

        int[] arr = {0,0,0,1,1,2,2,3};
        int result = uniqueElements(arr);
        System.out.println("No. of unique elements : " + result);
    }

    static int uniqueElements(int[] arr){
        
        int i = 0;

        for(int j = i+1;j < arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        int k = i+1;
        return k;
    }
}