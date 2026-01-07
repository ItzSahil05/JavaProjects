public class PositionInfiniteArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 10, 15, 16, 25, 32, 38, 46, 89, 105};
        int target = 105;
        int start = 0;
        int end = 1;
        while (arr[end]<target) {
            start = end;
            end += 1;
        }
        int ans = find(arr, target, start, end);
        System.out.println(ans);
    }
    static int find(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int midVal = start+(end-start)/2;
            if (arr[midVal]<target){
                start = midVal+1;
            } else if (arr[midVal]>target) {
                end = midVal-1;
            } else {
                return midVal;
            }
        }
        return -1;
    }
}
