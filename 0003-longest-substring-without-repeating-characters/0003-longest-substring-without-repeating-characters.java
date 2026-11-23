class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL = 0;
        int n = s.length();
        int l =0,r=0;
        int[] h = new int[256];
        Arrays.fill(h,-1);
        while (r<n){
            if(h[s.charAt(r)] != -1){
                l = Math.max(l,h[s.charAt(r)]+1);
            }
            int length = r-l+1;
            maxL=Math.max(length,maxL);
            h[s.charAt(r)]=r;
            r++;
        }
        return maxL;
    }
}