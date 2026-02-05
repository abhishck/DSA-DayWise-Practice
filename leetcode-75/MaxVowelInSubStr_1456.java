public class MaxVowelInSubStr_1456 {
    public static boolean isVowel(char c){
         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
     public static int maxVowels(String s, int k){
        int n=s.length();
        int low=0;
        int high;
        int count=0;
        int res=Integer.MIN_VALUE;
        for(high=0;high<k;high++){
            if(isVowel(s.charAt(high))){
                count++;
            }
        }
        res=Math.max(res,count);
        while(high<n){
            if(isVowel(s.charAt(low))){
                count--;
            }
            low++;
            if(isVowel(s.charAt(high))){
                count++;
            }
            high++;
            res=Math.max(res,count);
        }
        return res;
     }
     public static void main(String args[]){
        String s="abciiidef";
        int k=3;
        System.out.println(maxVowels(s,k));
     }
}
