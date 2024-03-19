import java.util.*;
class Day81 {

    static int heightChecker(int[] heights) {

        int[] h = heights.clone(); 

        Arrays.sort(h); 
        int count=0;
        for(int i=0 ; i<heights.length; i++){
            if(heights[i]!=h[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] h1 ={1,1,4,2,1,3};
        int[] h2 ={5,1,2,3,4};
        int[] h3 ={1,2,3,4,5};

        System.out.println(heightChecker(h1));
        System.out.println(heightChecker(h2));
        System.out.println(heightChecker(h3));
    }
}
