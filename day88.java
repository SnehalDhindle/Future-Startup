import java.util.*;
class Day88 {
    static void merge(int[] num1,int m,int[] num2,int n){

        int i = m-1, j = n-1,k=m+n-1;

        while (j>=0) {

            if (i>=0 && num1[i]>num2[j]) {
                num1[k]=num1[i];
                i--;
                k--;
            } else {
                num1[k]=num2[j];
                j--;
                k--;
            }
        }

        System.out.println(Arrays.toString(num1));

    }
    public static void main(String[] args){
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(n1,m,n2,n);

    } 
}
