//BRUTE FORCE APPRAOCH
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(costs[0]>coins){return 0;}
        int sum = 0;
        int count = 0 ;
        for(int i = 0;i<costs.length;i++){
            sum+=costs[i];
            if (sum > coins) {
                break;
            }
            if(sum<=coins){
               count++;
            }
        }
        return count;
    }
}