class Solution {
    public int pivotIndex(int[] nums) {
      int leftSum=0;
      int sum=0;
      for(int i=0;i<nums.length;i++){
         sum+=nums[i];
      }
      for(int i=0;i<nums.length;i++){
         sum-=nums[i];
        if(leftSum==sum){
            return i;
        }
        else{
            leftSum+=nums[i];
        }
      }
    return -1;
    }
}