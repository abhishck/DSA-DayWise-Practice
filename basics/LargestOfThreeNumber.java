import java.util.Scanner;

public class LargestOfThreeNumber {
    public static int largestNumber(int a ,int b, int c){
        if(a > b){
            if(a>c){
                return a;
            }
        }else{
            if(b>c){
             return b;
            }
        }
        return c;
    }
    public static void main(String args[]){
        int num;
        int num2;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
       num2= sc.nextInt();
       num3= sc.nextInt();
       System.out.println(largestNumber(num,num2,num3));
       sc.close();
    }
}
