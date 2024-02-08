import java.util.*;

class Day42 {
    static void reverseString(char[] s){
        if(s.length==0 || s.length==1){
            System.out.println(Arrays.toString(s));
            return;
        }

        int start = 0;
        int end = s.length-1;

        while(start<end){
            Character temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(s));


    }
  public static void main(String[] args){

    String s1 = "hello";
    String s2 = "Hannah";

    reverseString(s1.toCharArray());
    reverseString(s2.toCharArray());
  }  
}
