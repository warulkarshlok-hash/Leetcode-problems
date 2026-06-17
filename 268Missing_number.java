class Solution {
    public int missingNumber(int[] nums) {
       
       int n = nums.length;
       
       //Sum of n number formula 
       int sum = n*(n+1)/2;

       int real_sum = 0;
       for(int i = 0 ;i<nums.length;i++){
        real_sum+=nums[i];
       }

       return sum-real_sum;

    
    }
}