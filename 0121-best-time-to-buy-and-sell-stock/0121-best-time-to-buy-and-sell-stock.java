class Solution {
    public int maxProfit(int[] prices) {

     int max=0;
     int buy=prices[0];
     for(int i=0; i<prices.length; i++)
     {
        int current=prices[i]-buy;
        if(current>max)
        {
            max=current;
        }
        if(prices[i]<buy)
        {
           buy=prices[i];
        }
    }
    return max;
}
}