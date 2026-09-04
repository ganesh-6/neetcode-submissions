class Solution {
    public int[] sortArray(int[] nums) {
        // Selection Sort
        // for(int i=0; i<nums.length; i++) {
        //     int min = i;
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[min] > nums[j]) min = j;
        //     }
        //     int t = nums[i];
        //     nums[i] = nums[min];
        //     nums[min] = t;
        // }
        // return nums;

        // Bubble Sort
        for(int i=0; i<nums.length; i++) {
            boolean swap = false;
            for(int j=0; j<nums.length-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return nums;
    }
}