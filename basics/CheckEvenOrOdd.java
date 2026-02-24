import java.util.Scanner;

public class CheckEvenOrOdd {
    public static boolean checkNumber(int num){
        if( num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
       if(checkNumber(num)){
        System.out.println(num + " is an even number");
       }else{
        System.out.println(num + " is an odd number");
       }
    }
}
