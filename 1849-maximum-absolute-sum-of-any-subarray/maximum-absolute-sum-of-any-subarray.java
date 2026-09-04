class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int abs=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
            max= Math.max(sum,max);
             if(sum<0){
                sum=0;
             }
        }
        for(int i=0;i<nums.length;i++){
         abs+=nums[i];
           min=Math.min(abs,min);
           if(abs>0){
            abs=0;
           }
        }
        return Math.max(Math.abs(min),max);
    }
}