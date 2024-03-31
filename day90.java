import java.util.Arrays;

class Day90 {

    static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.toString(arr1).equals(Arrays.toString(arr2))){
            return true;
        }else{
            return false;
        }
    }
   public static void main(String[] args){
    String s = "dog";
    String t = "god";

    System.out.println(isAnagram(s,t));
   } 
}
