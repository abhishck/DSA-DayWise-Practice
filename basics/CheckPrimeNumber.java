import java.util.Scanner;

public class CheckPrimeNumber {
    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        num = sc.nextInt();
        if (checkPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
        sc.close();
    }
}
