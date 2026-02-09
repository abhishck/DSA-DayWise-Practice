public class IsSubsequence_392 {
    public static boolean isSubsequence(String s, String t){
        int n=s.length();
        int j=0;
        for(int i=0;i<n;i++){
            int start=t.indexOf(s.charAt(i),j);
            if(start == -1){
                return false;
            }
            j=start+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
