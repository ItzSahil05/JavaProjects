import java.util.Scanner;
public class prime_number {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int b = a%2;
        int c = a%3;
        int d = a%5;
        if (a==2||a==3||a==5) {
            System.out.println("Prime");
        } else if (b==0||c==0||d==0) {
            System.out.println("Not Prime.");
        } else {
            System.out.println("Prime");
        }
    }
}
