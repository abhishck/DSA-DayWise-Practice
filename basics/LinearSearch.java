import java.util.Scanner;

public class LinearSearch {
    public static boolean search(int key,int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
     public static void main(String args[]){
        int num;
        int[] arr={1,2,3,4,5,67,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
       num= sc.nextInt();
       System.out.println(search(num,arr));
       sc.close();
    }
}
