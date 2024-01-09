
class Day13 {

    static int subString(String s){

        int  n = s.length();
        int[] countOfChar = new int[128];
        int start = 0;
        int end = 0;
        int maxLength = 0;

        while(end<n){
            
            countOfChar[s.charAt(end)]++;

            while(countOfChar[s.charAt(end)]>1){
                countOfChar[s.charAt(start)]--;
                start++;
            }
        
                maxLength = Math.max(maxLength,end-start+1);
                end++;
            
        }

        return maxLength;
    }
    public static void main(String[] args){

        System.out.println(subString("bbbb"));
        System.out.println(subString("abcabcbb"));
        System.out.println(subString("pwwkew"));
    }
}
