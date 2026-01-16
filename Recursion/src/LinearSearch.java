import java.util.ArrayList;
public class LinearSearch {
    static void main() {
        int[] arr = {1, 2, 7, 5, 6, 7, 14, 20};
        System.out.println(exist(arr, 5, 0));
        System.out.println(position(arr, 5, 0));
        searchAll(arr, 7, 0);
        System.out.println(list);
    }
    static boolean exist(int[] arr, int value, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == value || exist(arr, value, index + 1);
    }
    static int position(int[] arr, int value, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == value) {
            return index;
        } else {
            return position(arr, value, index + 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr, int value, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == value) {
            list.add(index);
        }
        searchAll(arr, value, index + 1);
    }
}
