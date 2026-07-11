class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length(), c = 0, max_count = 0;
        String curr_str = "";
        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (!letters.contains(ch)) {
                c++;
                letters.add(ch);
                curr_str += ch;
            } else {
                int index = curr_str.indexOf(ch);
                curr_str = curr_str.substring(index + 1) + ch;
                c = curr_str.length();
            }

            max_count = Math.max(max_count, c);
        }

        return max_count;
        
    }
}
