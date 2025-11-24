import java.util.Scanner;
public class sum {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        int sum = first + second;
        System.out.print("The sum of number "+first+" and "+second+" is: "+sum);
    }
}
