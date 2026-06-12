class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0, j = nums.length - 1;

        while ( i <= j ) {
            if ( nums[i] == val ) {
                swap( nums, i, j );
                j--;
            } else {
                i++;
            }
        }

        return j+1;
    }
    public static void swap( int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}