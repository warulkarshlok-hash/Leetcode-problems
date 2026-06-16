class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;

        for (int j = 0; j <= sb.length(); j++) {

            if (j == sb.length() || sb.charAt(j) == ' ') {

                int l = i;
                int r = j - 1;

                while (l < r) {

                    char temp = sb.charAt(l);
                    sb.setCharAt(l, sb.charAt(r));
                    sb.setCharAt(r, temp);

                    l++;
                    r--;
                }

                i = j + 1;
            }
        }

        return sb.toString();
    }
}