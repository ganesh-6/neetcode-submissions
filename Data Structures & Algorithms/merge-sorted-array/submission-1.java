class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = Arrays.copyOf(nums1,m);
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(nums[i] < nums2[j]) nums1[k++]=nums[i++];
            else nums1[k++]=nums2[j++];
        }
        for(; i<m;) nums1[k++]=nums[i++];
        for(; j<n;) nums1[k++]=nums2[j++];
    }
}