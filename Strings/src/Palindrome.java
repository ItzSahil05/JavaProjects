import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = input.next();
        char[] ch = word.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while (start<end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start+=1;
            end-=1;
        }
        String reversed = new String(ch);
        String s = word.equals(reversed) ? "It is a Palindrome" : "It is not a Palindrome";
        System.out.println(s);
    }
}
