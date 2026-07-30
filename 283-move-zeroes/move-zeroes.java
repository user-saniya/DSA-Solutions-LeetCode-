class Solution {
    public void moveZeroes(int[] nums) {
   //Arrays.sort(nums);
   int count=0;
   int zero=0;
   for(int i=0;i<nums.length;i++){
    if(nums[i]!=0){
        nums[count++]=nums[i];
    }
    else{
    zero++;
    }
    }
    while(zero>0){
        nums[count++]=0;
     zero--;
    }

   
// int i=0;
// int j=-1;
// while(i<nums.length){
//     if(nums[i]==0&&j==-1){
//         j=i;
//     }
//     else if(nums[i]!=0&&j!=-1){
//         nums[j]=nums[i];
//         nums[i]=0;
//         j++;
//     }
//     i++;
// }
  }
}