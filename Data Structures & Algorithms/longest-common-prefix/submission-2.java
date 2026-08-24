class Solution {
    public String longestCommonPrefix(String[] strs) {
        // int size=Integer.MAX_VALUE;
        // for(String s: strs) {
        //     if(size>s.length()) size = s.length();
        // }
        // String ans = "";
        // for(int i=0; i<size; i++) {
        //     Character ch = strs[0].charAt(i);
        //     boolean j = true;
        //     for(String s: strs) {
        //         if(s.charAt(i) != ch) j=false;
        //     }
        //     if(j) ans += ch;
        //     else return ans;
        // }
        // return ans;

        String ans = strs[0];
        for(String s: strs) {
            int j = 0;
            while(j < Math.min(ans.length(),s.length())) {
                if(ans.charAt(j) == s.charAt(j)) j++;
                else break;
            }
            ans = ans.substring(0,j);
        }
        return ans;
    }
}