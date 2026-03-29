public class Binary_Search_704{
     public static int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int guess= (low+high)/2;
            if(target > nums[guess]){
                low=guess+1;
            }else if(target < nums[guess]){
                high=guess-1;
            }else{
                return guess;
            }
        }
        return -1;
    }
}