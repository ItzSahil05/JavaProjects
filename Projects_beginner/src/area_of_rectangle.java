import java.util.Scanner;
public class area_of_rectangle {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("The length of rectangle is (in centimetres): ");
        float length = input.nextFloat();
        System.out.print("The length of breadth is (in centimetres): ");
        float breadth = input.nextFloat();
        float p = 2*(length + breadth);
        float a = length*breadth;
        System.out.println("The Perimeter of rectangle is: "+p);
        System.out.print("The Area of rectangle is: "+a);
    }
}
