class Day83 {
    static boolean isPowerOfFour(int n){
        if(n<1)
            return false;
        
        if(n==1 || n==4)
            return true;

        int count=0;
        for(int i=0;i<32;i++){
            if(((n >> i) & 1) != 0){
                count++;
                if(i%2==1)
                    return false;
            }
        }

        if(count==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int n1 = 16;
        int n2 = 0;
        int n3 = 3;
        int n4 = 1;
        int n5 = 32;

        System.out.println(isPowerOfFour(n1));
        System.out.println(isPowerOfFour(n2));
        System.out.println(isPowerOfFour(n3));
        System.out.println(isPowerOfFour(n4));
        System.out.println(isPowerOfFour(n5));
    }
}
