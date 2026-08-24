class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: nums) {
            if(num != val) arr.add(num);
        }
        int i=0;
        for(int num: arr) nums[i++] = num;
        return arr.size();
    }
}