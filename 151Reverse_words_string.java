class Solution {
    public String reverseWords(String s) {

        int l = 0;
        int r = s.length() - 1;

        // Remove leading spaces
        while (l <= r && s.charAt(l) == ' ') {
            l++;
        }

        // Remove trailing spaces
        while (r >= l && s.charAt(r) == ' ') {
            r--;
        }

        StringBuilder sb = new StringBuilder();

        int i = l;

        // Build string with single spaces only
        while (i <= r) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                }
            }
            i++;
        }

        // Remove last extra space if present
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // Reverse entire string
        int start = 0;
        int end = sb.length() - 1;

        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);

            start++;
            end--;
        }

        // Reverse each word
        int p1 = 0;

        for (int p2 = 0; p2 <= sb.length(); p2++) {

            if (p2 == sb.length() || sb.charAt(p2) == ' ') {

                int k1 = p1;
                int k2 = p2 - 1;

                while (k1 < k2) {
                    char temp = sb.charAt(k1);
                    sb.setCharAt(k1, sb.charAt(k2));
                    sb.setCharAt(k2, temp);

                    k1++;
                    k2--;
                }

                p1 = p2 + 1;
            }
        }

        return sb.toString();
    }
}