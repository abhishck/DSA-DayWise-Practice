public class MaximumProductSubarray_152 {
     public static int maxProduct(int[] nums) {
        int n=nums.length;
        if(n == 1){
            return nums[0];
        }
        int minBestending=nums[0];
        int maxBestending=nums[0];
        int result=nums[0];
        for(int i=1;i<n;i++){
            int prevMin=minBestending;
            int prevMax=maxBestending;
            int v1=nums[i];
            int v2=prevMin * nums[i];
            int v3=prevMax * nums[i];
            minBestending=Math.min(v1,Math.min(v2,v3));
            maxBestending=Math.max(v1,Math.max(v2,v3));
            result=Math.max(result,Math.max(minBestending,maxBestending));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={-2,3,-4};
        System.out.println(maxProduct(nums));
    }
}
