class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lefmax=height[left],rightmax=height[right];
       int  water=0;
        while(left<right){
            if(lefmax<rightmax){
                left++;
                lefmax=Math.max(lefmax,height[left]);
                water+=lefmax-height[left];
            }
            else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                water+=rightmax-height[right];
            }

        }
        return water;
    }
}