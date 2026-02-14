public class RemoveElement_27 {
     public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0) return 0;
        int pos=0;
        for (int i=0;i<n;i++){
            if(nums[i] != val){
                nums[pos]=nums[i];
                pos++;
            }
        }
        return pos;
     }
     public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums, val));
     }
}
