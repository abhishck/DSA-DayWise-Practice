public class Solution_1784{
     public static boolean checkOnesSegment(String s) {
       return s.indexOf("01") == -1 ? true : false;
    }
    public static void main(String[] args) {
        String s="110011";
        System.out.println(checkOnesSegment(s));
    }
}