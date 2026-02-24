import java.util.Scanner;

public class SumOfDigit {
    public static int digitSum(int n){
        if(n < 10) return n;
       int sum=0;
       while(n > 0){
        int rem= n%10;
        sum+=rem;
        n/=10;
       }
       return sum;
    }
   public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
       System.out.println(digitSum(num));
       sc.close();
    }
}
