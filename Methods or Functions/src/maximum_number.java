public class maximum_number {
    static void main() {
        int[] arr = {1,25,46,54,75};
        System.out.println(max(arr));
    }
    static int max(int[]arr) {
        int maxVal = arr[0];
        for (int j : arr) {
            if (maxVal < j) {
                maxVal = j;
            }
        }
        return maxVal;
    }
}
