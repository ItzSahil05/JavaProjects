import java.util.Scanner;

public class repeat_name {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next().trim();
        System.out.print("Enter the number of times you want to repeat your name: ");
        int i = input.nextInt();
        System.out.println(repeat(name,i));
    }
    static boolean repeat(String name, int i) {
        for (int j = 0; j <= i; j++) {
            System.out.print(name + "  ");
        }
        return false;
    }
}
