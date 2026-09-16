class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            maxi = Math.max(maxi, weights[i]);
            sum = sum + weights[i];
        }
        int low = maxi;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(weights, days, mid)) {
                high = mid-1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean check(int[] weights, int days, int mid) {
        int sum = 0;
        int daysUsed = 1;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= mid) {
                sum = sum + weights[i];
            } 
            else {
                daysUsed++;
                sum = weights[i];
            }
        }
        return daysUsed <= days;
    }
}