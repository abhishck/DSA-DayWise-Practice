public class FirstOccurrence_28 {
      public static int strStr(String haystack, String needle){
        int start=haystack.indexOf(needle);
        return start;
      }
      public static void main(String args[]){
        String s1="sadbutsad";
        String s2="sad";
        System.out.println(strStr(s1, s2));
      }
}
