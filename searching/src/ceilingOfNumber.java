public class ceilingOfNumber {
    static void main() {
        int[] arr = {1, 10, 23, 25, 45, 55, 65, 78, 89};
//        int[] arr = {89, 75, 68, 54, 42, 25, 23, 10, 1};
        int target = 66;
        if (arr[0]<arr[arr.length-1]) {
            int asc = ceilingAsc(arr, target);
            System.out.println(asc);
        } else {
            int desc = ceilingDesc(arr, target);
            System.out.println(desc);
        }
    }
    static int ceilingAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midVal = start + (end - start) / 2;
                if (target < arr[midVal]) {
                    end = midVal - 1;
                } else if (target > arr[midVal]) {
                    start = midVal + 1;
                } else if (target == arr[midVal]) {
                    return midVal;
                }
        }
        return arr[start];
    }
    static int ceilingDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int midVal = start + (end-start) / 2;
                if (target < arr[midVal]) {
                    start = midVal + 1;
                } else if (target > arr[midVal]) {
                    end = midVal - 1;
                } else if (target == arr[midVal]) {
                    return midVal;
                }
        }
        return arr[end];
    }
}
