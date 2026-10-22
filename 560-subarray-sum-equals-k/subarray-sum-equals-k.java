class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<nums.length; i++){
            prefixSum = prefixSum + nums[i];
            int previousSum = prefixSum - k;
            if(map.containsKey(previousSum)){
                count = count + map.get(previousSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}