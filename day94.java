class Day94 {
    static String convertToTitle(int n){
        String str = "";
        if(n<27)
            return str+Character.toString(64+n);
        
        while(n>0){
            n--;
            int rem=n%26;
            str=Character.toString(65+rem)+str;
            n=n/26;
        }
        return str;
    }
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 28;
        int n3 = 701;

        System.out.println(convertToTitle(n1));
        System.out.println(convertToTitle(n2));
        System.out.println(convertToTitle(n3));

    }
}
