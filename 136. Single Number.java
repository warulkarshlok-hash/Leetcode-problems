class Solution {
    public int singleNumber(int[] nums) {
        boolean[] visited = new boolean[nums.length]; // tracks processed elements

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue; // skip already counted numbers
            }

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true; // mark duplicates
                }

            } if(count==1){
                return nums[i];
            }

    }
    return 0 ;
    }
}