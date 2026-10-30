class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
     int    ans=max;
        while(min<=max){
            int mid=min+(max-min)/2;
             if(isEat(piles,mid,h)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    private boolean isEat(int []arr,int mid,int h){
        int hours=0;
        for(int i=0;i<arr.length;i++){
            hours+=Math.ceil((arr[i]+mid-1)/mid);
        }
        return hours<=h;
    }
}