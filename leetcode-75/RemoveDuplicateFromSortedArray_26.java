public class RemoveDuplicateFromSortedArray_26 {
     public static int removeDuplicates(int[] nums){
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int pos=1;
        int j=1;
        while(j<n){
            if(nums[j] != nums[j-1]){
                nums[pos]=nums[j];
                pos++;
            }
            j++;
        }
        return pos;
     }
     public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
     }
}
