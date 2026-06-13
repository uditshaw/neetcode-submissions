class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] resArray = new int[n];

        Arrays.fill(leftProduct, 1);
        Arrays.fill(rightProduct, 1);

        leftProduct[0] = nums[0];
        rightProduct[n - 1] = nums[n - 1];

        for (int i = 1; i < nums.length; i++)
            leftProduct[i] = leftProduct[i - 1] * nums[i];

        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i];
        }

        resArray[0] = rightProduct[1];
        resArray[n - 1] = leftProduct[n - 2];

        for (int i = 1; i < n - 1; i++) {
            resArray[i] = leftProduct[i - 1] * rightProduct[i + 1];
        }

        return resArray;
        
    }
}  
