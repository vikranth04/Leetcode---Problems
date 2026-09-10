class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1; int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        int ans=right;
        while(left<=right){
            int mid= left+(right-left)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++){
                hours=hours+((long)piles[i]+mid-1)/mid;
            }
            if(hours<=h){
                right=mid-1;
                ans=mid;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}