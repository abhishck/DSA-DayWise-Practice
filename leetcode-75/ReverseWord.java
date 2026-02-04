public class ReverseWord {
    public static String reverseWords(String s){
        String s1=s.replaceAll("\\s+"," ").trim();
        String arr[]=s1.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }
}
