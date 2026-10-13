class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = 0;
        int sumofarray = 0 ;
        int totalsum = (n * (n + 1)) / 2;
        for(int i=0; i<n; i++){
            sumofarray += nums[i];
        }
        missing = totalsum - sumofarray;
        return missing;
    }
}