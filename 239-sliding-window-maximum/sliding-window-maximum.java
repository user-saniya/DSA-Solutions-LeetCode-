public class Solution{
public int[] maxSlidingWindow(int[] nums, int k) {
  int []result=new int [nums.length-k+1];
  int x=0;
  Deque<Integer>deq=new ArrayDeque<>();
  for(int i=0;i<nums.length;i++){
    while(!deq.isEmpty()&&deq.getFirst()<=i-k){
        deq.removeFirst();
    }
    while(!deq.isEmpty()&&nums[i]>=nums[deq.getLast()]){
        deq.removeLast();
    }
    deq.addLast(i);
    if(i>=k-1){
        result[x++]=nums[deq.getFirst()];
    }
  }
  return result;
}
}