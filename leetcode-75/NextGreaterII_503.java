import java.util.Stack;

public class NextGreaterII_503 {
    public static int[] nextGreaterElements(int[] nums){
        int n=nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            st.push(nums[i]);
        }
        for(int i=n-1;i>=0;i++){
            while(!st.empty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.empty()){
                res[i]=-1;
            }else{
                res[i]=
            }
        }
    }
}
