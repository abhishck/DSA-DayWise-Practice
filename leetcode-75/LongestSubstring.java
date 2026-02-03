import java.util.HashMap;

public class LongestSubstring{
     public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0;
        int res=Integer.MIN_VALUE;
        for(int high=0;high<n;high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            int len=high-low+1;
            while(map.size()<len){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++;
                len=high-low+1;
            }
             len=high-low+1;
            res=Math.max(res,len);

        }
        return res==Integer.MIN_VALUE?0:res;
    }
    public static void main(String args[]){
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}