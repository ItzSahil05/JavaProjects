import java.util.Scanner;

public class replace {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        String str1 = str.replaceAll("[aeiouAEIOU]","*");
        System.out.println(str1);
    }
}
