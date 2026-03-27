import java.util.Stack;

public class SimplifiedPath_71{
    public String simplifyPath(String path){
        int n=path.length();
        Stack<String> st = new Stack<>();
        String str[] = path.split("/");
        for(String i : str){
            if(!st.empty() && i.equals("..")){
                st.pop();
            }
            else if(!i.equals("") && i.equals(".") && i.equals("..")){
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(String i : st){
            sb.append("/").append(i);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}