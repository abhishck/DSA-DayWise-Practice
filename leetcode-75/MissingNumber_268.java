public class MissingNumber_268{
      public static int missingNumber(int[] nums){
        int n=nums.length;
        int missing=0;
        for(int i=0;i<n;i++){
            missing ^= i ^ nums[i];
        }
        return missing ^ n;
      }
      public static void main(String[] args) {
        int nums[]={3,0,1};
        System.out.println(missingNumber(nums));
      }
}