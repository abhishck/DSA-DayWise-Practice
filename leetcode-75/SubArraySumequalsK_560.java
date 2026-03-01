import java.util.HashMap;

public class SubArraySumequalsK_560{
     public static int subarraySum(int[] nums, int k){
        int n=nums.length;
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int ques=sum-k;
            if(map.containsKey(ques)){
                res+=map.get(ques);
            }
            map.put(sum, map.getOrDefault(ques, 0)+1);
        }
        return res;
     }
     public static void main(String[] args) {
        int nums[]={1,1,1};
        int k=2;
        System.out.println(subarraySum(nums, k));
     }
}