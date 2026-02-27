public class Solution_1480 {
      public static int[] runningSum(int[] nums) {
        int n=nums.length;
        if(n == 1){
            return nums;
        }
        int sum=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            res[i]=sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(runningSum(nums));
    }
}
