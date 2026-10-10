class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        int[] countDiff = new int[maxDiff + 1];
        for (int d : diff) {
            countDiff[d]++;
        }

        long k = (long) (k1 + k2);

        for (int currDiff = maxDiff; currDiff > 0
                && k > 0; currDiff--) {
            int ops = (int) Math.min(countDiff[currDiff], k);
            countDiff[currDiff] -= ops;
            countDiff[currDiff - 1] += ops;
            k -= ops;
        }

        long res = 0;
        for (long d = 1; d <= maxDiff; d++) {
            res += countDiff[(int) d] * d * d;
        }

        return res;
    }
}