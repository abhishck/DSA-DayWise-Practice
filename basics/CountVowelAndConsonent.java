import java.util.Scanner;

public class CountVowelAndConsonent {
    public static int countVowel(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        s = sc.nextLine();
        int n=countVowel(s);
        System.out.println("vowel count : "+ n);
        System.out.println("consonent count : "+(s.length()-n));
        sc.close();
    }
}
