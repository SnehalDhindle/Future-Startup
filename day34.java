class day34 {

    static int mySqrt(int x){
        if(x<=1){
            return x;
        }

        int i;
        
        for(i=2;x>=i*i;i++){
            if(i*i==x){
                return i;
            }
        }
        return i-1;
    }
    public static void main(String[] args){
        int x1 = 4;
        int x2 = 8;

        System.out.println(mySqrt(x1));
        System.out.println(mySqrt(x2));
    }
}
