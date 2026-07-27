class Solution {
    public int maxProduct(int n) {
        int firstmax=0;
        int secMax=0;
        while(n>0){
            int rem=n%10;
            if(rem>firstmax){
            secMax=firstmax;
            firstmax=rem;
            }
            else{
                secMax=Math.max(secMax,rem);
            }
            n=n/10;
        }
        return firstmax*secMax;

    }
}