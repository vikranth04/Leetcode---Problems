class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                int oldNum = map.get(num);
                return new int[]{oldNum, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}