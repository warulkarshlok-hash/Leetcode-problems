class Solution {
    public int[] rearrangeArray(int[] nums) {
        int half = nums.length/2;
        int[] positive = new int[half];
        int[] negative = new int[half];
        int j1 = 0 ;
        int j2 = 0 ;

        for(int i = 0; i<nums.length ; i++){
            if(nums[i]>0){
                positive[j1]=nums[i];
                j1++;
            }
            else{
                negative[j2]=nums[i];
                j2++;
            }
        }

        int p1 =0;
        int p2 =0;
        int k = 0;
        int[] ans = new int[nums.length];
        while(p1<positive.length && p2 < negative.length){
            ans[k] = positive[p1];
            k++;
            p1++;
            ans[k] = negative[p2];
            k++;
            p2++;
        }

        return ans;
    }
}
