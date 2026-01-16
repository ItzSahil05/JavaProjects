import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {4, 5, 0, 2, 3, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // get the last index and max element index and swap it.
            int last = arr.length-i-1;
            int max = getMax(arr, last);
            swap(arr, max, last);
        }
    }
    static int getMax(int[] arr, int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
