class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array to use the two-pointer technique
        Arrays.sort(nums);
        int n = nums.length;

        // Step 2: Fix the first element (i) and find pairs (left, right)
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for the first element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicate values for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after processing the current match
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small; move the left pointer rightward to increase the sum
                    left++;
                } else {
                    // Sum is too large; move the right pointer leftward to decrease the sum
                    right--;
                }
            }
        }

        return result;
    }
}
