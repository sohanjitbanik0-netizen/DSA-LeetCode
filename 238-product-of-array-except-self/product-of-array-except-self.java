class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] product = new int[nums.length];

        int p = 1;

        // Left product
        for (int i = 0; i < nums.length; i++) {
            product[i] = p;
            p = p * nums[i];
        }

        // Right product
        p = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] = product[i] * p;
            p = p * nums[i];
        }

        return product;
    }
}