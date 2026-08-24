class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size=Integer.MAX_VALUE;
        for(String s: strs) {
            if(size>s.length()) size = s.length();
        }
        String ans = "";
        for(int i=0; i<size; i++) {
            Character ch = strs[0].charAt(i);
            boolean j = true;
            for(String s: strs) {
                if(s.charAt(i) != ch) j=false;
            }
            if(j) ans += ch;
            else return ans;
        }
        return ans;
    }
}