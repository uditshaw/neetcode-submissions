class Solution {

    public String encode(List<String> strs) {
        String res = "";

        for(int i = 0 ; i < strs.size(); i++) {
            res += strs.get(i) + "₹";
        }

        if ( strs.size() > 0 )
            res += "a";

        return res;
    }

    public List<String> decode(String str) {
        String[] resArray = str.split("₹");

        if ( resArray.length == 0 )
            return Arrays.asList();

        return Arrays.asList(Arrays.copyOfRange(resArray, 0, resArray.length - 1));
    }
}
