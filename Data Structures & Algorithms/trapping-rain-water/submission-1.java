class Solution {
    public int trap(int[] arr) {

        int n = arr.length, res = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];

        for ( int i = 1; i < n; i++ ) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        for ( int i = n-2; i >= 0; i-- ) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for ( int i = 1; i < n-1; i++ ) {
            res += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return res;

    }
}
