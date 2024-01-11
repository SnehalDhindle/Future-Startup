import java.util.*;
class Day15 {

    static String addString(String s1,String s2){

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
       
        int i=arr1.length-1;
        int j=arr2.length-1;
        String str = "";
        int rem = 0;
        int c1 = 0;
        int c2 = 0;

        while(i>=0 || j>=0){
            if(i<0){
                
               c1 = 0;
               c2=Integer.parseInt(String.valueOf(arr2[j]));


            }else if(j<0){

                c1=Integer.parseInt(String.valueOf(arr1[i]));
                c2 = 0;

            }else{
                c1=Integer.parseInt(String.valueOf(arr1[i]));
                c2=Integer.parseInt(String.valueOf(arr2[j]));
            }

            int sum = c1+c2+rem;
            int lastNum = sum%10;
            str = lastNum + str;
            rem = sum/10;
            i--;
            j--;
            
        }

        return str;

        

    }
    public static void main(String[] args){

        String s1 = "554";
        String s2 = "67";
        
        String s3 = addString(s1,s2);

        System.out.println("Addition : " + s3);
    }
}
