class Day45 {

    static int divide(int dividend, int divisor){

        if(dividend==Integer.MIN_VALUE && divisor== -1){   //  -2147483648 / -1  = 2147483648
            return Integer.MAX_VALUE;                      //   since we are working with 32 bit signed integer                                                       
        }                                                  //    hence return 2147483647

        if(dividend==divisor){
            return 1;
        }

        boolean sign = (dividend<0 ^ divisor<0);

        int dvd = Math.abs(dividend);
        int dvs = Math.abs(divisor);

        int quotient = 0;

        while(dvd>=dvs){
            int temp = dvs;
            int mul = 1;
            while((dvd- temp<<1) >= 0){
                temp = temp<<1;
                mul = mul<<1;
            }

            dvd-=temp;
            quotient+=mul;
        }
        
        if(sign){
            return -1*quotient;
        }else{
            return quotient;
        }
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        int result = divide(dividend,divisor);
        System.out.println("result : " + result);
    }
}
