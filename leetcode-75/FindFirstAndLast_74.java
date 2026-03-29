public class FindFirstAndLast_74 {
     public int last(int[] nums ,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int mid=low +(high - low)/2;
            if(target >= nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(high >= 0 && nums[high] == target){
            return high;
        }
        return -1;
    }
    public int first(int[] nums , int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int mid=low +(high - low)/2;
            if(target <= nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(low < n && nums[low] == target){
            return low;
        }
        return -1;
    
    }
    public int[] searchRange(int[] nums, int target) {
       return new int[]{first(nums,target),last(nums,target)};
    }
}
