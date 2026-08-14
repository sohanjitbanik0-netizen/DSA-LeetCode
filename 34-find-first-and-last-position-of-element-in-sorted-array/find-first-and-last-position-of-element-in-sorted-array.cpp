class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int i = -1;
        int j = -1;
        int low = 0;
        int high = nums.size()-1;
        while(low<=high){
            int mid = low + (high - low) /2;
            if(nums[mid]==target){
                i =mid;
                high = mid-1;
            }
            else if (nums[mid]<target){
                low = mid + 1;
            }
            else{high = mid -1;}
        }
        low = 0;
        high = nums.size()-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target) {

                j = mid;

                low = mid + 1;

            }

            else if (nums[mid] < target) {

                low = mid + 1;

            }

            else {

                high = mid - 1;
                }
        }
    return{i,j};
    }
};