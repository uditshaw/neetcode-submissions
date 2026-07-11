class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> hs = new HashSet<>();

        int n = nums.length;
        for ( int i = 0; i < n-2; i++ ) {
            for ( int j = i+1; j < n-1; j++ ) {
                for ( int k = j+1; k < n; k++ ) {

                    if ( nums[i] + nums[j] + nums[k] == 0 ) {

                        List<Integer> al = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(al);

                        if ( !hs.contains(al) ) {
                            hs.add(al);
                        }

                    }
                }
            }
        }

        return new ArrayList<>(hs);
    }
}
