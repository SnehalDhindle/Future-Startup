import java.util.*;
class Day89 {
    
    static boolean isHappy(int n){
        if(n==1 || n==7)
            return true;
        if(n<10 && n!=1)
            return false;

        int i=n;
        
        while(i>9){
           int num= nextNum(i);
           i= num;
        
        }
        if(i==1 || i==7)
            return true;
        else
            return false;

        
    }

    static int nextNum(int j){
        int sum=0;
        while(j>0){
            int digit = j%10;
            sum = sum + digit*digit;
            j=j/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        System.out.println(isHappy(n));

    }
}
