class Solution {
    public int removeElement(int[] nums, int val) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int num: nums) {
        //     if(num != val) arr.add(num);
        // }
        // int i=0;
        // for(int num: arr) nums[i++] = num;
        // return arr.size();
        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) nums[k++] = nums[i];
        }
        return k;
    }
}