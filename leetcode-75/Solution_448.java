import java.util.ArrayList;
import java.util.List;

public class Solution_448 {
     public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
