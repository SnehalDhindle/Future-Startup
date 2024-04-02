class Day91 {
    static boolean isPalindrome(String s){
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;                
            }     
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    } 
}
