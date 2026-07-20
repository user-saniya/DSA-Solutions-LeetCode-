class Solution {
    public int countDigits(int num) {
     int digits=num;
     int count=0;
     while(num>0){
        int rem=num%10;
        if(digits%rem==0){
            count++;
        }
        num=num/10;
     }
     return count;
    }
}