class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ms = Math.min(word1.length(), word2.length());
        String ans = "";
        for(int i=0; i<ms; i++) {
            ans+=word1.charAt(i);
            ans+=word2.charAt(i);
        }
        if(word1.length() > word2.length()) {
            ans = ans + word1.substring(ms);
        } else {
            ans = ans + word2.substring(ms);
        }
        return ans;
    }
}