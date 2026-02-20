import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringIsAcronymOfWord_2828{
      public static boolean isAcronym(List<String> words, String s){
        int n=s.length();
        int m=words.size();
        if(n>m|| n<m){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch != words.get(i).charAt(0)){
                return false;
            }
        }
        return true;
      }
      public static void main(String[] args) {
        List<String> words=new ArrayList<>(Arrays.asList("alice","bob","charlie"));
        String s="abc";
        System.out.println(isAcronym(words, s));
      }
}