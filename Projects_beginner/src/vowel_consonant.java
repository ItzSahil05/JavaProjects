import java.util.Scanner;

public class vowel_consonant {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Alphabet: ");
        char ch = input.next().trim().charAt(0);
        char lowerCase = Character.toLowerCase(ch);
        if (lowerCase=='a'||lowerCase=='e'||lowerCase=='i'||lowerCase=='o'||lowerCase=='u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
