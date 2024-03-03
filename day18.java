import java.util.Stack;

class ValidParenthisis {

    static boolean isValid(String s){

        if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']' ){
            return false;
        }

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{

                if(!st.empty()){

                    char c = (char)st.peek();

                    if(ch==')' || ch=='}' || ch==']' ){

                        if(ch==')' && c=='('){
                            st.pop();
                        }else if(ch==']' && c=='['){
                            st.pop();
                        }else if(ch=='}' && c=='{'){
                            st.pop();
                        }else{
                            return false;
                        }
                    
                    }
                }else{
                    return false;
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        String s1 = "([)";
        String s2 = "(){}}{";
        String s3 = "(]";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
    
}