class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        Arrays.sort(nums);
        int count = 1, maxCount = 1;
        for ( int i = 1; i < nums.length; i++) {
            if ( nums[i] - nums[i-1] == 1 ) {
                count++;
            } else if ( nums[i] == nums[i-1] ) {
                continue;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);
    }
}
