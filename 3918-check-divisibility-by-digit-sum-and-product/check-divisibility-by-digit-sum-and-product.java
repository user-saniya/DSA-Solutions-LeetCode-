class Solution {
    public boolean checkDivisibility(int n) {
      int num=n;
      int sum=0;
      int pro=1;
      while(num>0){
        int rem=num%10;
        sum=sum+rem;
        pro=pro*rem;
        num=num/10;
      }  
      if(n%(sum+pro)==0){
        return true;
      }
      return false;
    }
}