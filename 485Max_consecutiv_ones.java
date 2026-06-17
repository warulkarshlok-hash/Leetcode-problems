class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int curr_max = 0;
        int i = 0;

        while (i < nums.length) {

            if (nums[i] == 1) {
                count++;
                curr_max = Math.max(curr_max, count);
            } else {
                count = 0;
            }

            i++;
        }

        return curr_max;
    }
}