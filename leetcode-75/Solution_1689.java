public class Solution_1689{
     public static int minPartitions(String n){
        int res=Integer.MIN_VALUE;
        for(char ch:n.toCharArray()){
            res=Math.max(res,(ch-'0'));
        }
        return res;
     }
     public static void main(String[] args) {
        String n="32";
        System.out.println(minPartitions(n));
     }
}