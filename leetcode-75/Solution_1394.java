public class Solution_1394 {
     public static int findLucky(int[] arr) {
        int n=arr.length;
        int res=0;
        int freq[] = new int[501];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<501;i++){
            if(i==freq[i]){
                res=Math.max(res,freq[i]);
            }
        }
        return res==0 ? -1 : res;
    }
}
