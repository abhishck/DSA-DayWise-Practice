import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII_167 {
    public static int[] twoSum(int[] numbers, int target){
        int n=numbers.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(numbers[i],i+1);
        }
        for(int i=0;i<n;i++){
            int question=target-numbers[i];
            if(map.containsKey(question) && map.get(question) != i+1){
                return new int[]{i+1,map.get(question)};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
