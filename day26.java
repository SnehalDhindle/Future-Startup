class Day26 {

    int majorityElement(int[] num){

        int count = 0;
        int ele = 0;

        for(int i=0;i<num.length;i++){
            if(count==0){
                ele = num[i];
                count++;
            }
            else{
                if(num[i]==ele)
                    count++;
                else
                    count--;
            }
        }

        return ele;
    }
    public static void main(String[] args){

        Day26 d26 = new Day26();

        int[] num1 = new int[]{3,2,3};
        int[] num2 = new int[]{2,2,1,1,1};

        int ret1 = d26.majorityElement(num1);
        int ret2 = d26.majorityElement(num2);

        System.out.println("1]" + ret1);
        System.out.println("2]" + ret2);
    }
}
