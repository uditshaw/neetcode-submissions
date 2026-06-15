class Solution {
    public boolean isPalindrome(String s) {

        String resString = "", revString = "";
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                resString += ch;
                revString = ch + revString;
            }
        }

        return resString.equalsIgnoreCase(revString);
    }
}
