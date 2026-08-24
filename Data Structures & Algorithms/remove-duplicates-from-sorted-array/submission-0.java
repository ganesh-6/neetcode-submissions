class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int num: nums)  ts.add(num);
        int i=0;
        for(int num: ts) nums[i++] = num;
        return ts.size();
    }
}