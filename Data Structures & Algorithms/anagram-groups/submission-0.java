class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();

        for (String string : strs) {

            String sortedString = stringSort(string);
            List<String> al = new ArrayList<>();

            if (hm.containsKey(sortedString)) {
                al.addAll(hm.get(sortedString));
            }

            al.add(string);
            hm.put(sortedString, al);
        }


        List<List<String>> groupAnagList = new ArrayList<>();

        for ( Map.Entry<String, List<String>> mapElement : hm.entrySet() ) {
            groupAnagList.add(mapElement.getValue());
        }

        return groupAnagList;
    }

    public static String stringSort(String str) {

        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
