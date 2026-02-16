import java.util.*;

public class ContainsDuplicate_217 {
      public static boolean containsDuplicate(int[] nums){
         int n=nums.length;
        if(n == 1){
            return false;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            boolean check=set.add(nums[i]);
            if(!check){
                return true;
            }
        }
        return false;
      }
      public static void main(String args[]){
        int nums[]={1,2,3,1};
        System.out.println(containsDuplicate(nums));
      }
}
