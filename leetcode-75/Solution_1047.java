import java.util.Stack;

public class Solution_1047 {
     public static String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb=new StringBuilder("");
        int i;
        for(i=0;i<n;i++){
             if( !st.empty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        while(!st.empty()){
            sb.append(st.pop());
            
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
}
