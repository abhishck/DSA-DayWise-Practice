import java.util.*;

public class ContainsDuplicateII_M2{
     public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}