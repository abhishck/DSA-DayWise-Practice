public class Solution_1470{
     public static int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];
        int i=0;
        int j=n;
        int k=0;
        while(j<2*n){
            res[k++]=nums[i];
            res[k++]=nums[j];
            i++;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(shuffle(nums,n));
    }
}