class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       int count=atmost(nums,k)-atmost(nums,k-1);
       return count;
    }
     private int atmost(int []nums,int k){
       int j=0;
       int count=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.size()>k){
            map.put(nums[j],map.get(nums[j])-1);
            if(map.get(nums[j])==0){map.remove(nums[j]);}
            j++;
        }
        count+=i-j+1;
       } 
       return count;
    }
}