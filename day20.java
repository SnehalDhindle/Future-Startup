class FirstOccurence {

    static int strStr(String str , String s){
        
        return str.indexOf(s);

    }
    public static void main(String[] agrs){
        String s1 = "leetcode";
        String s2 = "leeto";
        String s3 = "sadbutsad";
        String s4 = "but";

        System.out.println(strStr(s1,s2));
        System.out.println(strStr(s3,s4));
    }
}
