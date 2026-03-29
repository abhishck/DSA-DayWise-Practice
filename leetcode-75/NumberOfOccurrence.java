public class NumberOfOccurrence {
    int first(int[] arr , int target){
        int n = arr.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(low < n && arr[low]==target){
            return low;
        }
        return -1;
    }
    int last(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(high >= 0 && arr[high]==target){
            return high;
        }
        return -1;
    }
    int countFreq(int[] arr, int target) {
        int firstIndex=first(arr, target);
        if(firstIndex == -1) return 0;
        int lastIndex=last(arr, target);
        return lastIndex-firstIndex+1;

    }
}
