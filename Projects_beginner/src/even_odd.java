import java.util.Scanner;
public class even_odd {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int b = a%2;
        if (b == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
