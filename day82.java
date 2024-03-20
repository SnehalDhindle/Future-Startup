class Day82 {

    static boolean isPowerOfTwo(int n){
        if(n<1)
            return false;
        
        if(n==1)
            return true;

        while(n>=2){
            int i=n%2;
            if(i!=0){
                return false;
            }
            n=n/2;
        }

        return true;
    }
    public static void main(String[] args){
        int n1 = 16;
        int n2 = 0;
        int n3 = 3;
        int n4 = 1;
        int n5 = 6;

        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
        System.out.println(isPowerOfTwo(n3));
        System.out.println(isPowerOfTwo(n4));
        System.out.println(isPowerOfTwo(n5));
    }
}
