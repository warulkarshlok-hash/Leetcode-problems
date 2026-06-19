class Solution {
    public int largestAltitude(int[] gain) {
      int n = gain.length;
      int[] ans  = new int[n+1];
      ans[0]=0;
      ans[1]=gain[0];
      int curr_sum = ans[0] + ans[1];
      
      int j =  2;
      for(int i = 1;i<n;i++){
        ans[j] = gain[i]+curr_sum;
        curr_sum = ans[j];
        j++;
      }
    int max = ans[0];

    for(int k = 1; k < ans.length; k++){
    if(ans[k] > max){
        max = ans[k];
    }
}
return max;
 }
}