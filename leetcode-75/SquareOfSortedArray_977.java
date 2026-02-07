
import java.util.Arrays;

public class SquareOfSortedArray_977{
    public static int[] sortedSquares(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                res[k--]=nums[i]*nums[i];
                i++;
            }else{
                res[k--]=nums[j]*nums[j];
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}