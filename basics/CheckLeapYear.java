import java.util.Scanner;

public class CheckLeapYear {
    public static boolean checkYear(int n){
        if( n % 4 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
       System.out.println(checkYear(num));
       sc.close();
    }
}
