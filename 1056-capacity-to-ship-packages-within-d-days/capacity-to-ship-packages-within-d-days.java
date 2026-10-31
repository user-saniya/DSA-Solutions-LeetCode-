class Solution {
    public int shipWithinDays(int[] weights, int days) {
           int low=0;
           int high=0;
           int ans=0;
           for(int w:weights){
             high+=w;
           low= Math.max(low,w);
           }
           while(low<=high){
            int mid=low+(high-low)/2;
            if(capacity(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           }  
           return ans;            
    }
    private boolean capacity(int []weights,int capacity,int days){
        int day=1;
        int sum=0;
        for(int i:weights){
            if(sum+i>capacity){
                sum=i;
                day++;
            }
            else{
                sum+=i;
            }
        }
        return day<=days;
    }

} 