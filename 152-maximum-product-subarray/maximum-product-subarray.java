class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int m = nums[0];
        int min = nums[0];
        int temp = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++){
            if (nums[i] > 0){
                max = Math.max(nums[i],max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            }
            else if(nums[i] == 0){
                max =0;
                min = 0;
            }
            else{
                temp = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], temp * nums[i]);
            }
            m = Math.max(m, max);
        }
    return m;
    }
}