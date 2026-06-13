class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> elementFreq = new HashMap<>();

        for ( int number: nums ) {
            elementFreq.put(number, elementFreq.getOrDefault(number, 0) + 1);
        }

        int maxFreq = 1, maxNum = nums[0];
        for ( Map.Entry<Integer, Integer> entry: elementFreq.entrySet() ) {
            if ( entry.getValue() > maxFreq ) {
                maxFreq = entry.getValue();
                maxNum = entry.getKey();
            }
        }

        return maxNum;
    }
}