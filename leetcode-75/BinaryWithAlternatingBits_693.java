public class BinaryWithAlternatingBits_693 {
     public static boolean hasAlternatingBits(int n) {
        int lsb=2;
        while(n != 0){
            int last=n & 1;
            n = n>>1;
            if(lsb == last){
                return false;
            }
            lsb=last;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(hasAlternatingBits(num));
    }
}
