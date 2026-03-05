public class Solution_1758{
     public static int minOperations(String s){
        int n=s.length();
        int countStartWith1=0;
        int countStartWith0=0;
        int check=1;
        for(int i=0;i<n;i++){
            if(check == (s.charAt(i)-'0')){
                countStartWith0++;
            }else{
                countStartWith1++;
            }
            check=check ^ 1;
        }
        return Math.min(countStartWith0,countStartWith1);
     }
     public static void main(String[] args) {
        String s="10010100";
        System.out.println(minOperations(s));
     }
}