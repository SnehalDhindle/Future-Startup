class LongestPrefix {

    String longestPrefix(String[] strs){

        String s = "";

        if(strs.length==0){
            return s;
        }

        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){
            int j=0;
            while(j<prefix.length() && j<strs[i].length() && prefix.charAt(j)==strs[i].charAt(j)){
                j++;
            }

            prefix = prefix.substring(0, j);
        }

        return prefix;
    }
    public static void main(String[] args){

        LongestPrefix lp = new LongestPrefix();
        String[] s1 = new String[]{"flowers","flow","flight"};
        String[] s2 = new String[]{"dog","racecar","car"};

        String result1 = lp.longestPrefix(s1);
        String result2 = lp.longestPrefix(s2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
