public class ValidPalindrome_125 {
     public static boolean isPalindrome(String s){
        int n=s.length();
        if(n==0){
            return true;
        }
        int start=0;
        int end=n-1;
        while(start<=end){
            char currFirst=s.charAt(start);
            char currLast=s.charAt(end);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                end--;
            }else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
     }
     public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
     }
}
