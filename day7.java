class Day7 {

    boolean isPalindrome(int x){
        if(x<0)
            return false;
        
        int num1 = x;
        int num2 = 0;

        while(x>0){
            int rem = x % 10;          
            num2 = num2*10 + rem;      
            x = x/10;
        }

        if(num1==num2)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int x = 121;
        
        Day7 d7 = new Day7();
        boolean result = d7.isPalindrome(x);

        System.out .println("Integer is Palindrome :" + result);
    }
}
