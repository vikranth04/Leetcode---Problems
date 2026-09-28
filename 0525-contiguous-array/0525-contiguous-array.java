class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        int balance =0;
        int maxLength=0;
        map.put(0, -1);
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                balance=balance+1;
            }
            else{
                balance=balance-1;
            }
            if(map.containsKey(balance)) {
            int firstIndex = map.get(balance);
            int length= i-firstIndex;
            maxLength=Math.max(maxLength,length);
            } 
            else {
                map.put(balance,i);
            }
        }
        return maxLength;
    }
}