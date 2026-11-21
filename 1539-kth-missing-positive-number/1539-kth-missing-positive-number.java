class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, h = arr.length;
        int m;
        while(l<h){
            m = l+(h-l)/2;
            if(arr[m]-m-1<k){
                l = m+1;
            }else{
                h = m;
            }
        }
        return l+k;
    }
}