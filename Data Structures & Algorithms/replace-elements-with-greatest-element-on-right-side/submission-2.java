class Solution {
    public int[] replaceElements(int[] arr) {
        // int[] ls = new int[arr.length];
        // for(int i=0; i<arr.length; i++) {
        //     int max=-1;
        //     for(int j=i+1; j<arr.length; j++) {
        //         max = Math.max(max, arr[j]);
        //     }
        //     ls[i] = max;
        // }
        // return ls;

        int[] ans = new int[arr.length];
        int max = -1;
        for(int i=arr.length-1; i>=0; i--) {
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }
        return ans;
    }
}