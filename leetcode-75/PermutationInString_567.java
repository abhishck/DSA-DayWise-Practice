public class PermutationInString_567 {

    public static boolean sahi(int[] need,int[] have){
        for(int i=0;i<26;i++){
            if(need[i]!=have[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkInclusion(String s1, String s2){
        int n=s1.length();
        int m=s2.length();
        if(n > m){
            return false;
        }
        int low=0;
        int high;
        int need[]=new int[26];
        int have[]=new int[26];
        for(int i=0;i<n;i++){
            need[s1.charAt(i)-'a']++;
        }
        for(high=0;high<n;high++){
            have[s2.charAt(high)-'a']++;
            
        }
        if(sahi(need,have)) return true;
        while(high<m){
            have[s2.charAt(low)-'a']--;
            low++;
            have[s2.charAt(high)-'a']++;
            high++;
            if(sahi(need, have)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}
