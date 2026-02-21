import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII_219 {
     public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high;
        Set<Integer> set=new HashSet<>();
        if( k >= n){
            for(int c : nums){
                if(set.contains(c)){
                    return true;
                }
                set.add(c);
            }
            return false;
        }
        for(high=0;high<=k;high++){
            if(set.contains(nums[high])){
                return true;
            }
            set.add(nums[high]);
        }
        while(high<n){
            set.remove(nums[low]);
            low++;
            if(set.contains(nums[high])){
                return true;
            }
            set.add(nums[high]);
            high++;
        }
        return false;
    }
   
}
