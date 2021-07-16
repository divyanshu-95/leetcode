class Solution {
    public int searchInsert(int[] nums, int target) {
        int li = 0, hi = nums.length-1;

        while (li <= hi) {
            int mid = (li+hi)/2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid])
                hi = mid-1;
            else
                li = mid+1;
        }
        return li;
    }
}
