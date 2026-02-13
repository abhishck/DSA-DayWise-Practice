public class HappyNumber_202{
    public static int sq(int n){
        if(n%10==n){
            return n*n;
        }
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            sum+=rem*rem;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast != 1){
            slow=sq(slow);
            fast=sq(fast);
            fast=sq(fast);
            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n=19;
        System.out.println(isHappy(n));
    }
}