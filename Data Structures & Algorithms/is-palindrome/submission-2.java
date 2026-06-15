class Solution {
    public boolean isPalindrome(String s) {

        String resString = "";
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                resString += ch;
            }
        }

        String revString = "";
        for (int i = resString.length() - 1; i >= 0; i--) {
            revString += resString.charAt(i);
        }

        return resString.equalsIgnoreCase(revString);
    }
}
