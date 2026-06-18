// TWO POINTER APPROACH
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) {
                left++;
            }

            if (nums[right] % 2 == 1) {
                right--;
            }
        }

        return nums;
    }
}


// MAKING EVEN NEGATIVE APPROACH : 
// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         if(nums.length==1){
//             return nums;
//         }

//         for(int i = 0;i<nums.length;i++){
//             if(nums[i]%2==0){
//                 nums[i]=-nums[i];
//             }
//         }
//         Arrays.sort(nums);

//         for(int j = 0;j<nums.length;j++){
//             if(nums[j]<0){
//                 nums[j]=-nums[j];
//             }
//         }
//         return nums;

//     }
// }