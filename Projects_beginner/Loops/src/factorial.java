import java.util.Scanner;

public class factorial {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int fact = 1;
        for (int n = input.nextInt(); n>0;){
            fact*=n;
            n--;
        }
        System.out.println("Factorial = "+fact);
    }
}

