public class ValidAnagram_242 {
     public static boolean isAnagram(String s, String t){
        int n=s.length();
        int m=t.length();
        if(n != m){
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
            count[s.charAt(i)-'a']--;
        }
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
     }
     public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s, t));
     }
}
