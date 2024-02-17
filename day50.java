class Day50 {

    static boolean checkPerfectNumber(int num){
        if(num%2!=0)                      
            return false;                   //all perfect numbers are even 
        
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
            if(sum>num){
                return false;
            }
        }

        if(sum==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int n1 = 28;
        int n2 = 7;

       System.out.println(checkPerfectNumber(n1));
       System.out.println(checkPerfectNumber(n2));
    }
}
