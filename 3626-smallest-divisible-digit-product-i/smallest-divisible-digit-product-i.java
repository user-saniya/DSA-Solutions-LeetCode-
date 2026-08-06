class Solution {
    public int smallestNumber(int n, int t) {
     while(helper(n)%t!=0){
        n++;
     } 
     return n; 
    }
    public int helper(int n){
        int product=1;
        while(n>0){
            int r=n%10;
            product*=r;
            n/=10;
        }
        return product;
    }
}