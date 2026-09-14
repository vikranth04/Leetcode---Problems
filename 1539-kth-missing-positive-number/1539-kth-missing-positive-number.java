class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1; int count =0;
        while(count<k){
            boolean found =false;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==num){
                    found =true;
                    break;
                }
            }
            if(!found){
                count++;
            }
            num++;       
        }
        return num-1;
    }
}