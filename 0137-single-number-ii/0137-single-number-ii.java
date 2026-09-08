class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int num : nums) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                int mask = 1 << bit;
                result = result | mask;
            }
        }
        return result;
    }
}