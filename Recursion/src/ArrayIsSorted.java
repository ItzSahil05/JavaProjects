public class ArrayIsSorted {
    static void main() {
        int[] arr = {1, 2, 4, 5, 6, 7};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
