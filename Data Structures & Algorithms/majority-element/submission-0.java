class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res=0, maxCount=0;
        for(int num: nums) {
            mp.put(num, mp.getOrDefault(num, 0)+1);
            if(mp.get(num) > maxCount) {
                res = num;
                maxCount = mp.get(num);
            }
        }
        return res;
    }
}