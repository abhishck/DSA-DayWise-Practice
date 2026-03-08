public class SingleNumber_136{
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        int unique=0;
        for(int i=0;i<n;i++){
            unique ^= nums[i];
        }
        return unique;
    }
    public static void main(String[] args) {
        int nums[]={4,4,1};
        System.out.println(singleNumber(nums));
    }
}