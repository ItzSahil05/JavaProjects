import java.util.Scanner;

public class sum {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = input.nextInt();
        System.out.print("Enter number 2: ");
        int b = input.nextInt();
        System.out.println(sum(a,b));
    }
    static int sum(int a, int b) {
        int c = a+b;
        return c;
    }
}
