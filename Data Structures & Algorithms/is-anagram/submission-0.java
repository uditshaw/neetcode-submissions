class Solution {
    public boolean isAnagram(String s, String t) {

        int length1 = s.length(), length2 = t.length();

        if ( length1 != length2 )
            return false;

        if ( s.equalsIgnoreCase(t) )
            return true;

        return (sortString(s).equalsIgnoreCase(sortString(t)));
    }

    public static String sortString(String str) {

        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
