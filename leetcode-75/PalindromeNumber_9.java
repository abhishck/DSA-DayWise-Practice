public class PalindromeNumber_9{
     public static boolean isPalindrome(int x){
        // check if the number is negative or the number's remainder is zero then return false
        if( x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        // instead of checking the whole number just check the half number
        int reverseHalf =0;
        while(x > reverseHalf){
            reverseHalf=reverseHalf * 10 + x % 10;
            x=x/10;
        }
        // check if there are even digits then return by just comparing and if there are odd digit then just reduce the one digit more by dividing it by10 and compare
        return x== reverseHalf || x==reverseHalf/10;
     }
     public static void main(String[] args) {
       int x=12321;
       System.out.println(isPalindrome(x));
     }
}