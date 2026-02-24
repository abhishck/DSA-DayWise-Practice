import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
       for(int i=1;i<=num;i++){
        System.out.print(a+ " ");
        sum=a+b;
        a=b;
        b=sum;
       }
      sc.close();
    }
}
