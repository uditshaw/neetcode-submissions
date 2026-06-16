class Solution {
    public int longestConsecutive(int[] nums) {
        if ( nums.length == 0 || nums.length == 1 ) return nums.length;

        int low = nums[0], high = nums[0], len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] < low)
                low = nums[i];
            if (nums[i] > high)
                high = nums[i];
        }

        int size = high - low;
        int[] freq = new int[size + 1];
        for (int i = 0; i < len; i++) {
            freq[nums[i] - low]++;
        }

        int count = 0, maxCount = 1;
        for (int i = 0; i < size + 1; i++) {
            if (freq[i] == 0) {
                maxCount = Math.max(maxCount, count);
                count = 0;
                continue;
            }
            count++;
        }
        return Math.max(maxCount, count);
    }
}
