class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for (int value : nums) {
            if (hs.contains(value))
                return true;
            hs.add(value);
        }

        return false;
        

    }
}