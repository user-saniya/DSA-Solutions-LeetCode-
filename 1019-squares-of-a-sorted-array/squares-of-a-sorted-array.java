class Solution {
    public int[] sortedSquares(int[] nums) {
        int []arr=new int[nums.length];
      //  Arrays.sort(nums);
      int low=0;
      int high=nums.length-1;
      int i=nums.length-1;
      while(low<=high){
        if(Math.abs(nums[low])>Math.abs(nums[high])){
            arr[i]=nums[low]*nums[low];
            low++;
        }
        else{
            arr[i]=nums[high]*nums[high];
            high--;
        
        }
        i--;
      }
        return arr;
    }
}