public class binarySearch {
    static void main() {
        int[] arr = {1, 5, 20, 23, 33, 36, 42, 56, 79, 92, 98};
        int ans = searchElement(arr, 42);
        System.out.println(ans);
    }

    static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midValue = start + (end - start) / 2;
            if (arr[start] < arr[end]) {
                if (arr[midValue] < target) {
                    start = midValue + 1;
                } else if (arr[midValue] > target) {
                    end = midValue - 1;
                } else if (arr[midValue] == target) {
                    return midValue;
                }
            } else if (arr[end] < arr[start]) {
                    if (arr[midValue] < target) {
                        end = midValue - 1;
                    } else if (arr[midValue] > target) {
                        start = midValue + 1;
                    } else if (arr[midValue] == target) {
                        return midValue;
                    }
            }
        }
        return -1;
    }
}
