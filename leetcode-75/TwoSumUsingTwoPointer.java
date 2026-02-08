import java.util.Arrays;

public class TwoSumUsingTwoPointer {
    
    public int[] twoSum(int[] nums, int target){
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int value=nums[i]+nums[j];
            if(value>target){
                j--;
            }else if(value<target){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        TwoSumUsingTwoPointer t1=new TwoSumUsingTwoPointer();
      System.out.println(Arrays.toString(t1.twoSum(nums,target)));
    }
   
}

