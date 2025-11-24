import java.util.Scanner;

public class areaOfCircle {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        System.out.println(area(r));
    }
    static double area(double r){
        return r*r;
    }
}
