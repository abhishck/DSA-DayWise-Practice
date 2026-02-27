public class Solution_1991 {
     public static int findMiddleIndex(int[] nums) {
        int n =nums.length;
        int totalSum=0;
        for( int a : nums){
            totalSum+=a;
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=totalSum-nums[i]-left;
            if(right==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
     public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        System.out.println(findMiddleIndex(nums));
    }
}
