class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int mp=0;
        while(r<prices.length){
            //profit=sale-purchase
            if(prices[r]>prices[l]){
            int profit=prices[r]-prices[l];
            mp=Math.max(mp,profit);
            }else{
                l=r;
            }
            r++;
        }
        return mp;
    }
}
