class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length, j = 0, k = n-1, max_area = 0;

        while (j < k) {

            int min_height = Math.min(arr[j], arr[k]);
            int area = min_height * (k-j);

            max_area = Math.max(max_area, area);

            if (arr[j] < arr[k] ) 
                j++;
            else k--;
            
        }

        return max_area;
    }
}
