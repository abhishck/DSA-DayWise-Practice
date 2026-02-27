public class FindPivotPoint_724{
     public static int pivotIndex(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int left=0;
        for (int i = 0; i < n; i++) {
           
            int right = sum - nums[i] - left;
            if (left == right) {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}