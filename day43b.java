import java.util.*;

class Day43b {

    static String reverseVowels(String s){
        if(s.length()==0 || s.length()==1){
            System.out.println(s);
            return s;
        }

        char[] c = s.toCharArray();

        int start = 0;
        int end = c.length-1;

        while(start<end){
            if(isVowel(c[start]) && isVowel(c[end])){

                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;

            }else if(isVowel(c[start])){
                end--;
            }else{
                start++;
            }
        }

        String str = new String(c);
        return str;

        // return Arrays.toString(c);

    }

//    static boolean isVowel(char c){
//         char ch = Character.toLowerCase(c);
//         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//             return true;
//         }else{
//             return false;
//         }
//     }
    static boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) throws Exception {
        
        String s1 = "hello";
        String s2 = "leetcode";

        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
        
    }
}
