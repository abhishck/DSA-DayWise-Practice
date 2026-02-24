import java.util.Scanner;

public class ReverseNumber {
    public static long reverse(int n){
        if(n ==0 ) return 0;
        if( n <10){
            return n;
        }
        boolean negative=false;
        if(n < 0){
            negative = true;
            n = Math.abs(n);
        }
        int number=0;
        while( n > 0){
            int rem=n%10;
            number=number*10+rem;
            n/=10;
        }
        return negative ? number * -1 :number;
    }
     public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
       num= sc.nextInt();
      System.out.println(reverse(num));
    }
}
