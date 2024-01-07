class day10 {

    static int romanNum(String str){
        int sum = 0;

        for(int i=str.length()-1;i>=0;i--){

            if(str.charAt(i)=='I'){
                if(i<=str.length()-2 && (str.charAt(i+1)=='V' || str.charAt(i+1)=='X'))
                    sum = sum - 1;
                else
                    sum = sum + 1;
            }

            else if(str.charAt(i)=='V'){
                sum = sum + 5;
            }
            
            else if(str.charAt(i)=='X'){
                if(i<=str.length()-2 && (str.charAt(i+1)=='L' || str.charAt(i+1)=='C'))
                    sum = sum - 10;
                else
                    sum = sum + 10;
            }

            else if(str.charAt(i)=='L'){
                sum = sum + 50;
            }

            else if(str.charAt(i)=='C'){
                if(i<=str.length()-2 && (str.charAt(i+1)=='D' || str.charAt(i+1)=='M'))
                    sum = sum - 100;
                else
                    sum = sum + 100;
            }

            else if(str.charAt(i)=='D'){
                sum = sum + 500;
            }

            else if(str.charAt(i)=='M'){
                sum = sum + 1000;
            }

        }

        return sum;

    }
    public static void main(String[] args){

    System.out.println("III -> " + romanNum("III"));

    System.out.println("LVIII -> " + romanNum("LVIII"));

    System.out.println("MCMXCIV ->" +romanNum("MCMXCIV"));
    }
}
