public class MimimumSubarraySum{
     static int smallestSumSubarray(int a[], int size) {
         if(size==1){
            return a[0];
        }
        int bestending=a[0];
        int result=a[0];
        for(int i=1;i<size;i++){
            int prevbestending=bestending;
            int v1=prevbestending + a[i];
            int v2=a[i];
            bestending=Math.min(v1,v2);
            result=Math.min(result,bestending);
        }
        return result;
     }
     public static void main(String args[]){
        int a[]={3,-4, 2,-3,-1, 7,-5};
        int size=7;
        System.out.println(smallestSumSubarray(a, size));
     }
}