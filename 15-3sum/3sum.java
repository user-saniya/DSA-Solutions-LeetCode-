class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>>result=new HashSet<>();
        for(int i=0;i<nums.length;i++){
             int first=i+1;
             int last=nums.length-1;
             while(first<last){
               int sum=nums[i]+nums[first]+nums[last];
               if(sum==0){
                result.add(Arrays.asList(nums[i],nums[first],nums[last]));
                first++;
               }
               else if(sum>0){
                last--;
               }
               else{
                first++;
               }
             }
        }
        return new ArrayList(result);
    }
    }