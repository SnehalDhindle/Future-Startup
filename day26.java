import java.util.*;
class Day26 {
    static void maxCharInString(String s){
        s=s.toLowerCase().replace(" ", "");
        System.out.println(s);

        Map<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }

        int max = Integer.MIN_VALUE;
        char maxchar = '\0';

        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
           if(entry.getValue()>max){
                max = entry.getValue();
                maxchar = entry.getKey();
           }
        }

        System.out.println(maxchar);
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        String s = "Snehal Shivaji Dhindle";

        maxCharInString(s);
    }    
}
