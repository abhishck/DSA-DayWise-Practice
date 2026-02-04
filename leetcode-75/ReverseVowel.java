import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowel {
    public static void swap(char[] arr, int i, int j) {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static String reverseVowels(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        char[] arr=s.toCharArray();
        HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while(i<=j){
            if(!set.contains(arr[i])){
                i++;
            }else if(!set.contains(arr[j])){
                j--;
            }else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s="IceCreAm";
        System.out.println(reverseVowels(s));
    }
}