import java.util.Scanner;

public class ReverseAString {
    public static String reverseString(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder("");
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
       s= sc.nextLine();
       System.out.println(reverseString(s));
       sc.close();
    }
}
