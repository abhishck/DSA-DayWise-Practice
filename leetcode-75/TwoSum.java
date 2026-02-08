import java.util.*;

public class TwoSum{
   
    public int[] twoSum(int[] nums, int target){
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int question=target-nums[i];
            // check if the same index is used for the answer 
            if(map.containsKey(question) && map.get(question)!=i){
                return new int[]{i,map.get(question)};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int[] nums={2,7,11,15};
        int target=9;
        TwoSum t=new TwoSum();
        System.out.println(Arrays.toString(t.twoSum(nums, target)));
        
        }
}