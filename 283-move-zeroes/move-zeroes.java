class Solution {
    public void moveZeroes(int[] nums) {
   // Arrays.sort(nums);
//    int count=0;
//    int zero=0;
//    for(int i=0;i<nums.length;i++){
//     if(nums[i]!=0){
//         nums[count++]=nums[i];
//     }
//     else{
//     zero++;
//     }
//     }
//     while(zero>0){
//         nums[count++]=0;
//      zero--;
//     }
int count=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]!=0){
        int swap=nums[i];
        nums[i]=nums[count];
        nums[count]=swap;
        count++;
    }
    }
  }
}