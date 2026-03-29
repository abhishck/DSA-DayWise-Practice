public class CeilInASortedArray {
     public int findCeil(int[] arr, int x) {
         int n=arr.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int guess = low + (high-low)/2;
            if(x > arr[guess]){
                low=guess+1;
            }else if(x <= arr[guess]){
                high=guess-1;
            }
        }
        return low >= n ? -1 : low;
     }
}
