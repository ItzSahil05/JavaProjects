import java.util.Arrays;
import java.util.Scanner;

public class minNum {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Smallest number in array is: "+min(arr));
    }
    static int min(int[]arr){
        int minnum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minnum){
                minnum = arr[i];
            }
        }
        return minnum;
    }
}
