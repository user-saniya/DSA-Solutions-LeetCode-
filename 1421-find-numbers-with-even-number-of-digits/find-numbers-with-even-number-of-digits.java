class Solution {
    private boolean countdigits(int nums){
        int count=0;
          while(nums>0){
                int rem=nums%10;
                count++;
                nums=nums/10;
            }
            if(count%2==0){
                return true;
            }
            return false;
    }
    public int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(countdigits(nums[i])){
                count++;
                }
            }
            return count;
    }
    }