class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=1;j<nums.length;j++){
                if(j!=i && nums[j]+nums[i]==target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}