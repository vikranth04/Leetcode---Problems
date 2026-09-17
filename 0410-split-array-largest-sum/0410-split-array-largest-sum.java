class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max = -1;
        int sum =0;
        for(int i =0;i<n ;i++){
            sum = sum + nums[i];
            max = Math.max(max,nums[i]);
        }
        int low = max;
        int high = sum;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(split(nums,n,mid,k)){
                high = mid -1;
                ans = mid;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public boolean split(int[] nums, int n , int maxsum , int maxsubarrcount) {
        int subarr_count = 1;
        int sum = 0;
        for(int i=0;i<n ;i++){
            if(nums[i]>maxsum) return false;
            else if((nums[i]+sum) > maxsum){
                // next subarray
                subarr_count++;
                sum = nums[i];
            }
            else{
                sum = sum + nums[i];
            }
            if(subarr_count>maxsubarrcount)return false;
        }
        return true;
    }
}