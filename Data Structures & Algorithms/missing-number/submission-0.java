class Solution {
    public int missingNumber(int[] nums) {
        
        int sum1=0;
        int sum2=0;
        for(int k:nums){
            sum1=sum1+k;
        }
        for(int i=0;i<=nums.length;i++){
             sum2=sum2+i;
        }
        return sum2-sum1;
    }
}
