import java.util.Arrays;
import java.util.Scanner;

public class maxNum {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Largest number in array is: "+max(arr));
    }
    static int max(int[]arr){
        int maxnum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxnum){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }
}
