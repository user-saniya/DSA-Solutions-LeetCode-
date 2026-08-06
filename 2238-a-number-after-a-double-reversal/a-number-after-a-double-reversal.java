class Solution {
    public int  reverse(int num){
        int rev=0;
        while(num>0){
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
       int rev=reverse(num);
       if(reverse(rev)==num){
       return true;
       }
       return false;
    }
}