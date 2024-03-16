import java.util.HashMap;

class Day79 {

    static boolean wordPattern(String pattern , String s){

        String[] arr = s.split(" ");
        if(arr.length!=pattern.length())
            return false;
        
        HashMap<Character,String> hm = new HashMap<Character,String>();

        for(int i=0;i<pattern.length();i++){
            boolean containsKey = hm.containsKey(pattern.charAt(i));

            if(hm.containsValue(arr[i]) && !containsKey){
                return false;
            }else if(containsKey && !hm.get(pattern.charAt(i)).equals(arr[i])){
                return false;
            }else{
                hm.put(pattern.charAt(i),arr[i]);
            }

        }

        return true;
    }
    public static void main(String[] args) {
        String p1 = "abba";
        String s1 = "dog dog dog dog";

        String p2 = "abba";
        String s2 = "cat dog dog cat";

        System.out.println(wordPattern(p1,s1));
        System.out.println(wordPattern(p2,s2));
  }  
}
