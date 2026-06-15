class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int[] arr = new int[set.size()];

        int index = 0;

        for(Integer num : set){
            arr[index] = num;
            index++;
        }

        if(arr.length < 3){
            return arr[arr.length - 1];
        }

        return arr[arr.length - 3];
    }
}