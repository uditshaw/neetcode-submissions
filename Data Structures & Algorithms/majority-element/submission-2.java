class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> elementFreq = new HashMap<>();
        int n = nums.length;

        for ( int number: nums ) {
            elementFreq.put(number, elementFreq.getOrDefault(number, 0) + 1);
        }

        int maxFreq = 1, maxNum = nums[0];
        for ( Map.Entry<Integer, Integer> entry: elementFreq.entrySet() ) {
            if ( entry.getValue() > n / 2 ) {
                maxFreq = entry.getValue();
                maxNum = entry.getKey();
                break;
            }
        }

        return maxNum;
    }
}