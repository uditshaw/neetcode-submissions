class Solution {
    public int maxArea(int[] arr) {
        int maxArea = 0, n = arr.length;

        for ( int i = 0; i < n-1; i++ ) {
            for ( int j = i+1; j < n; j++ ) {

                int ht = Math.min(arr[i], arr[j]);
                int area = ht * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
