class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // char[] s1 = s.toCharArray();
        // char[] s2 = t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(s2);
        // return Arrays.equals(s1,s2);

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            h1.put(s.charAt(i), h1.getOrDefault(s.charAt(i),0) +1);
            h2.put(t.charAt(i), h2.getOrDefault(t.charAt(i),0) +1);
        }
        return h1.equals(h2);
    }
}
