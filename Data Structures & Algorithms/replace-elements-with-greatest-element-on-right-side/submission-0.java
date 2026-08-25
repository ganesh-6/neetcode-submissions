class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ls = new int[arr.length];
        for(int i=0; i<arr.length-1; i++) {
            int max=0;
            for(int j=i+1; j<arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            ls[i] = max;
        }
        ls[arr.length-1] = -1;
        return ls;
    }
}