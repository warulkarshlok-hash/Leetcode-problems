public class MajorityElement {
     boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true; 
                }

            }
            if(count > nums.length/2){
                return nums[i];
            }
    }
    return 0;
}
