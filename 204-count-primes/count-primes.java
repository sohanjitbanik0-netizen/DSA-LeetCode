class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean [] prime = new boolean[n+1];
        
        for (int i=2; i<=n; i++){
            prime[i]=true;
        }
        for(int p = 2; p*p<=n; p++){
            if(prime[p]==true){
                for(int i=p*p; i<=n; i+=p){
                    prime[i]=false;
                }
            }
        }
        for(int p=2; p<n; p++){
            if (prime[p]==true){
                count++;
            }
        }
        
    return count;}
}