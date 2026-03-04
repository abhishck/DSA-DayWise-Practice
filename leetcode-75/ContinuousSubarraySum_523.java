import java.util.HashMap;

public class ContinuousSubarraySum_523{
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n == 1){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int question = sum % k;
            if (map.containsKey(question)) {
                if(i-map.get(question) >= 2){
                    return true;
                }
            }else{
                 map.put(question, i);
            }
           
        }
        return false;
    }
    public static void main(String args[]){
        int nums[]={23,2,4,6,7};
        int k=6;
        System.out.println(checkSubarraySum(nums, k));
    }
}