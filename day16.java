import java.util.*;
class Day16 {
    static int waysOfClimbing(int n){
      if(n==1 || n==2 || n==3){
        return n;
      }else{
        int n1=2;
        int n2=3;
        int n3=0;
        
        for(int i=4;i<=n;i++){
          n3 = n1 + n2;
          n1 = n2;
          n2 = n3;
        }
        return n3;
      }
    }
    
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of step : ");
    int n = sc.nextInt();
    int output = waysOfClimbing(n);
    System.out.println("Number of Ways :" + output);
    sc.close();
   }  
}
