import java.util.Scanner;

public class removingSpaces {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = input.nextLine();
        String str1 = str.replace(" ", "");
        System.out.println(str1);
    }
}
