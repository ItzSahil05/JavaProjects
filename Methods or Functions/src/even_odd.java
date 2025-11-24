import java.util.Scanner;

public class even_odd {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.println(eoro(a));
    }
    static String eoro(int a) {
        String num = "Odd";
        if (a%2==0) {
            num = "Even";
        }
        return num;
    }
}
