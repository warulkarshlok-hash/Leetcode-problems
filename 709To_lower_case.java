class Solution {
    public String toLowerCase(String s) {

        // StringBuilder ans = new StringBuilder();

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);

        //     if (ch >= 'A' && ch <= 'Z') {
        //         //To convert it into small (char) letter 
        //         ch = (char)(ch + 32);
        //     }

        //     ans.append(ch);
        // }

        // return ans.toString();

     
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr);
    }
}
    