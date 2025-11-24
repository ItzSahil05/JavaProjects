import java.util.Scanner;

public class sum_N_natural_numbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter natural number: ");
        int n = input.nextInt();
        int a = 0;
        int sum = 0;
        while (a<=n){
            sum+=a;
            a+=1;
        }
        System.out.println(sum);
    }
}
