class Solution {
    private int roman(char ch){
        if(ch=='I')return 1;
        if(ch=='V') return 5;
        if(ch=='X')return 10;
        if(ch=='L')return 50;
        if(ch=='C')return 100;
        if(ch=='D')return 500;
        return 1000;
    }
    public int romanToInt(String s) {
        int sum=0;
        int prev=0;
      for(int i=s.length()-1;i>=0;i--){
        int digit=roman(s.charAt(i));
      if(prev>digit){
        sum-=digit;
      }
      else{
        sum+=digit;
      }
      prev=digit;
      }
      return sum;
    }
}