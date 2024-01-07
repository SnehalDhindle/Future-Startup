class day12 {

    static int endWordLength(String str){
       
        int count = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' ')
                break;
            else
                count++;
        }

        return count;
    }
    public static void main(String[] args){

        String str1 = "Welcome to Coding World";
        
        System.out.println("Last word length : " + endWordLength(str1));

    }
}
