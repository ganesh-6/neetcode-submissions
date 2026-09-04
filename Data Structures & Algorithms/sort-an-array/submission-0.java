class Solution {
    public int[] sortArray(int[] nums) {
        // Selection Sort

        for(int i=0; i<nums.length; i++) {
            int min = i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[min] > nums[j]) min = j;
            }
            int t = nums[i];
            nums[i] = nums[min];
            nums[min] = t;
        }
        return nums;
    }
}