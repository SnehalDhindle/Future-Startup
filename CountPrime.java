class Countprime {

    static int countPrime(int n){
        if(n<=2)
            return 0;
    
        boolean[] composite = new boolean[n];

        for(int i=2;i<=Math.sqrt(n);i++){
            if(composite[i]==false){
                for(int j=i*i;j<n;j=j+i){
                    composite[j]=true;
                }
            }
        }

        int count = 0;
        for(int i=2;i<n;i++){
            if(composite[i]==false)
                count++;
        }

        return count;
    }
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 0;
        int n3 = 1;

        System.out.println(countPrime(n1));
        System.out.println(countPrime(n2));
        System.out.println(countPrime(n3));

    }
}
