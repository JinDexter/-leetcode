class Solution {
    public int searchInsert(int[] nums, int target) {
        int ptr = 0 ;
        for(; ptr < nums.length ; ptr++ ){
            if(nums[ptr] > target)
            {
                break;
            }
            if(nums[ptr] == target)
            {
                break;
            }
        }
        return ptr;
    }
}
