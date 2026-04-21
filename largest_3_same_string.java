class Solution {
    public String largestGoodInteger(String num) {
        String result = "";

        for (int i = 0; i < num.length() - 2; i++) {
            char ch = num.charAt(i);

            
            if (ch == num.charAt(i + 1) && ch == num.charAt(i + 2)) {
                String temp = "" + ch + ch + ch;

            
                if (result.equals("") || temp.compareTo(result) > 0) {
                    result = temp;
                }
            }
        }

        return result;
    }
}