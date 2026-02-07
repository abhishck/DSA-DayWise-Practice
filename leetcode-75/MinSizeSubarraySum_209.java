public class MinSizeSubarraySum_209{
    public static int minSubArrayLen(int target, int[] nums){
        int n=nums.length;
        int low=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        for(int high=0;high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                int len=high-low+1;
                res=Math.min(res,len);
                sum-=nums[low];
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res ;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target, nums));
    }
}