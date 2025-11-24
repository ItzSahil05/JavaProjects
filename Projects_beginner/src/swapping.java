import java.util.Scanner;
public class swapping {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();
        int temp = a;
        System.out.println("Before swapping:-");
        System.out.println("First number = "+a);
        System.out.println("Second number = "+b);
        a = b;
        b = temp;
        System.out.println("After swapping:-");
        System.out.println("First number = "+a);
        System.out.println("Second number = "+b);
    }
}
