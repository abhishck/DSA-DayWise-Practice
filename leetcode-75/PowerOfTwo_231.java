public class PowerOfTwo_231 {
     public static boolean isPowerOfTwo(int n){
        int count=0;
        while(n>0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        return count==1 ? true : false;
     }
      public static boolean isPowerOfTwo2(int n){
        return n>0 && (n & (n-1))==0;
      }
      public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo2(n));
      }
}
