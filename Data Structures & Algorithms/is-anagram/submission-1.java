class Solution {
    public boolean isAnagram(String s, String t) {

        int length1 = s.length(), length2 = t.length();

        if (length1 != length2)
            return false;

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        }

        for (var entry: charCount.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }

        return true;
    }
}
