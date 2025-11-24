public class sumArrayNumbers {
    static void main() {
        int[] arr = {12, 45, 52, 45, 32};
        System.out.println("The sum of numbers in array is: "+sum(arr));
    }
    static int sum(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
