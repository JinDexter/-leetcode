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
//Solution 2：
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length - 1;
        if(right == 0)
        return 0;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else {right = mid -1;}
        }
        return left;
    }
}
