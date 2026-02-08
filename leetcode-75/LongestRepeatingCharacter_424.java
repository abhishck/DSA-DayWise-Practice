public class LongestRepeatingCharacter_424 {
     public static int maxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    public static int characterReplacement(String s, int k) {
        int n=s.length();
        int low=0;
        int res=Integer.MIN_VALUE;
        int[] arr=new int[26];
        for(int high=0;high<n;high++){
                arr[s.charAt(high)-'A']++;
                int len=high-low+1;
                int maxElem=maxElement(arr);
                int diff=len-maxElem;
                while(diff>k){
                    arr[s.charAt(low)-'A']--;
                    low++;
                      len=high-low+1;
                      maxElem=maxElement(arr);
                      diff=len-maxElem;
                }
                len=high-low+1;
                res=Math.max(res,len);

        }
        return res==Integer.MIN_VALUE? 0 : res;
    }
    public static void main(String args[]){
       String s="AABABBA";
       int k=1;
       System.out.println(characterReplacement(s, k));
    }
}
