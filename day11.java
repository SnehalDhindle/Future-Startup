import java.util.*;
public class day11 {

    static int countPrime(int n){

        if(n==0 || n==1 || n==2)
            return 0;


        else{
            int count = 1;

            for(int i=3;i<n;i++){
                
                if(i%2!=0){
                    
                    int fac = 0;

                    for(int j=1;j<=i;j++){
                        if(i%j==0)
                        fac++;
                        if(fac==3)
                        break;
                 }

                if(fac==2)
                    count++;
                }
            }

            return count;
        }
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println(countPrime(n));
    
        sc.close();
    }
}
