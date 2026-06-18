// Better Approach: Use a HashSet
// Idea
// Put all elements into a HashSet.
// Check numbers from 1 to n.
// If a number is not in the set, add it to the answer.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
