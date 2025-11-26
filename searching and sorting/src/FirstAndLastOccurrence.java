public class FirstAndLastOccurrence {
    static void main() {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 6, 6, 6};
        int target = 7;
        int firstOccurrence = firstOccurrence(arr,target);
        int lastOccurrence = lastOccurrence(arr, target);
        System.out.println(firstOccurrence+", "+lastOccurrence);
    }
    static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end) {
            int midVal = start+(end-start)/2;
            if (target==arr[midVal]){
                ans = midVal;
                end = midVal-1;
            } else if (target>arr[midVal]) {
                start = midVal+1;
            } else {
                end = midVal-1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end) {
            int midVal = start+(end-start)/2;
            if (target==arr[midVal]){
                ans = midVal;
                start = midVal+1;
            } else if (target>arr[midVal]) {
                start = midVal+1;
            } else {
                end = midVal-1;
            }
        }
        return ans;
    }
}
