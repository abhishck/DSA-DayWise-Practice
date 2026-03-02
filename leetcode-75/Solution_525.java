import java.util.HashMap;

public class Solution_525{
    public static int findMaxLength(int[] nums) {
        int n=nums.length;
        int count1=0;
        int count0=0;
        int res=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count1++;
            }else{
                count0++;
            }
            int diff=count1-count0;
            if(diff == 0){
                res=Math.max(res,i+1);
            }
            else if(map.containsKey(diff)){
                res=Math.max(res,(i- map.get(diff)));
            }
             else{
                map.put(diff,i);
             }
        }
        return res;
    }
    public static void main(String args[]){
        int nums[]={0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}