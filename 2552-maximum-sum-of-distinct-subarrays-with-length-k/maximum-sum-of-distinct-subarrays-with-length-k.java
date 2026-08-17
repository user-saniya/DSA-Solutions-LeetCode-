import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0, r = 0, n = nums.length;
        long sum = 0, maxsum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        while (r < n) {
            sum += nums[r];

            if (!hm.containsKey(nums[r])) {
                hm.put(nums[r], 1);
                if (r - l + 1 == k) {
                    maxsum = Math.max(maxsum, sum);
                    sum -= nums[l];
                    hm.remove(nums[l]);
                    l++;
                }
            } else {
                while (nums[l] != nums[r]) {
                    sum -= nums[l];
                    hm.remove(nums[l]);
                    l++;
                }
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return maxsum;
    }
}