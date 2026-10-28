class Solution {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        int low=0;
        int high=nums.length-1;
        int mid=low+high/2;
     while(low<high){
         mid=(low+high)/2;
        if(nums[mid+1]<nums[mid]){
            return nums[mid+1];
        }
        else if(nums[mid]<=nums[high]){
            high=mid;
        }
        else{
            low=mid+1;
        }
     }
        return nums[low];
    }
}