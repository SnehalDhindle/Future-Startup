import java.util.*;
class Day13b {

    static int maxSubString(String s){

        ArrayList al = new ArrayList();
        int maxLength = 0; 

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(al.contains(ch)){
                al.clear();
                al.add(ch);
            }
            else{
                al.add(ch);
            }
            maxLength = Math.max(maxLength,al.size());
            
        }

        return maxLength;


    }
    public static void main(String[] args){
        
        System.out.println(maxSubString("bbbb"));
        System.out.println(maxSubString("abcabcbb"));
        System.out.println(maxSubString("pwwkew"));
    }
}
