import java.util.Scanner;

public class Factorial {
    public static long factorial(int n){
        if( n==1 || n==0) return 1;
        int fact=1;
        for(int i=n;i>1;i--){
            fact *= i;
        }
        return fact;
    }
     public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
       System.out.println(factorial(num));
    }
}
