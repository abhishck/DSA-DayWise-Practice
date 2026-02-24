import java.util.Scanner;

public class PalimdromeNumber {
    public static boolean checkPalimdrome(int n){
        if( n < 0 || (n %10 ==0 && n != 0)){
            return false;
        }
        int halfReversed=0;
        while(n > halfReversed){
            int rem=n% 10;
            halfReversed =halfReversed*10 +rem;
            n/=10;
        }
        return halfReversed == n || halfReversed/10 == n;
    }
     public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
      System.out.println(checkPalimdrome(num));
      sc.close();
    }
}
