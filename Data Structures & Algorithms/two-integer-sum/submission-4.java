class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ansArr = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                ansArr[0] = hm.get(target - nums[i]);
                ansArr[1] = i;
                break;
            }
            hm.put(nums[i], i);
        }

        return ansArr;

    }
}
