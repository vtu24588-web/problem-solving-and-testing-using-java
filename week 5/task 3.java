class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSoFar = Integer.MIN_VALUE;
        int minSoFar = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;
        int totalSum = 0;
        for (int num : nums) {
            currentMax = Math.max(num, currentMax + num);
            maxSoFar = Math.max(maxSoFar, currentMax);
            currentMin = Math.min(num, currentMin + num);
            minSoFar = Math.min(minSoFar, currentMin);
            totalSum += num;
        }
        if (maxSoFar < 0) {
            return maxSoFar;
        } else {
            return Math.max(maxSoFar, totalSum - minSoFar);
        }
    }
}
