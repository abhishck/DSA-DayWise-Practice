public class Solution_1512 {
      public static int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        int count=0;
        int freq[]=new int[101];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            if(freq[i]>1){
                int val=(freq[i]*(freq[i]-1))/2;
                count+=val;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
