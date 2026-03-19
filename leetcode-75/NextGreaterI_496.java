import java.util.HashMap;
import java.util.Stack;

public class NextGreaterI_496 {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int m=nums1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums2[n-1],-1);
        Stack<Integer> st = new Stack<>();
        st.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            while( !st.empty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.empty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
        }
        int res[] = new int[m];
        for(int i=0;i<m;i++){
            int ques=nums1[i];
            if(map.containsKey(ques)){
                res[i]=map.get(ques);
            }else{
                res[i]=-1;
            }
        }
        return res;
     }
     public static void main(String[] args) {
        int nums1[]={2,4};
        int nums2[]={1,2,3,4};
        System.out.println((nextGreaterElement(nums1, nums2)).toString());
     }
}
