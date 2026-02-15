public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices){
        int n=prices.length;
        int minPrice=prices[0];
        int maxProfit=0;
        // here i apply the greedy approach in which i choose the best choice at the current step and hoping it leads to the global optimal answer
        // at every step i asked what should be the profit if i sell it today?
        for(int i=1;i<n;i++){
            if(minPrice > prices[i]){
                minPrice=prices[i];
            }else{
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
