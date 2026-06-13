class Solution {
    public int majorityElement(int[] nums) {

        int count = 0, candidate = -1, n = nums.length;

        for ( int i = 0; i < n; i++ ) {
            if ( count == 0 ) {
                candidate = nums[i];
                count++;
            } else {
                if ( nums[i] == candidate ) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return candidate;
    }
}