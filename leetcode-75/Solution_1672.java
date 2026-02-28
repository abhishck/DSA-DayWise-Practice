public class Solution_1672{
     public static int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int res=Integer.MIN_VALUE;
        for(int i =0 ;i<n;i++){
            int m=accounts[i].length;
            int sum=0;
            for(int j=0;j<m;j++){
                sum += accounts[i][j];
            }
            res=Math.max(res,sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}