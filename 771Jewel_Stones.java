class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
       
        int count  = 0;
        for(int i = 0;i<jewels.length();i++){
            for(int j = 0 ; j< stones.length(); j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count ; 

        //USING HASHSET
        // HashSet<Character> set = new HashSet<>();

        // for(char c : jewels.toCharArray()){
        //     set.add(c);
        // }

        // int count = 0;

        // for(char c : stones.toCharArray()){
        //     if(set.contains(c)){
        //         count++;
        //     }
        // }

        // return count;
    }
}
       
    