public class findMaxAverage_643{
    public static double findMaxAverage(int[] nums, int k){
        int n=nums.length;
        int low=0;
        int high;
        double sum=0;
        double res=Double.NEGATIVE_INFINITY;
        for(high=0;high<k;high++){
            sum+=nums[high];
        }
        res=Math.max(res,sum/k);
        while(high<n){
            sum-=nums[low];
            low++;
            sum+=nums[high];
            high++;
            res=Math.max(res,sum/k);
        }
        return res;
    }
    public static void main(String args[]){
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}