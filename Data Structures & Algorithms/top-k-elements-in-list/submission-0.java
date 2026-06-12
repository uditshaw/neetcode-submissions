class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        ArrayList<int[]> freq = new ArrayList<>();

        for ( Map.Entry<Integer, Integer> entry: mp.entrySet()) {
            freq.add(new int[]{entry.getKey(), entry.getValue()});
        }

        freq.sort((p1, p2) -> {
            if ( p1[1] == p2[1] )
                return Integer.compare(p2[0], p1[0]);

            return Integer.compare(p2[1], p1[1]);
        });

        int[] res = new int[k];

        for ( int i = 0; i < k; i++ ) {
            res[i] = freq.get(i)[0];
        }

        return res;
    }
}
