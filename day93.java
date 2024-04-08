class Day93 {
    static int titleToNumber(String s){
        if(s.length()==0)
            return s.charAt(0)-64;
        int result=0;
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i) - 64;
            result = result*26+ch;
        }
        return result;
    }
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "AB";
        String s3 = "ZA";

        System.out.println(titleToNumber(s1));
        System.out.println(titleToNumber(s2));
        System.out.println(titleToNumber(s3));
    }    
}
