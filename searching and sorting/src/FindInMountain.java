public class FindInMountain {
    static void main() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 15, 14, 13, 10, 5};
        int peak = peakElement(arr);
        int target = 5;
        int ans = findAsc(arr, target, 0, peak);
        if (ans == -1){
            ans = findDesc(arr, target, peak, arr.length-1);
            if (ans == -1){
                System.out.println("Element does not exist in array!");
            } else {
                System.out.println(ans);
            }
        } else {
            System.out.println(ans);
        }
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int midVal = start+(end-start)/2;
            if (arr[midVal]<arr[midVal+1]){
                start = midVal+1;
            } else {
                end = midVal;
            }
        }
        return start;
    }
    static int findAsc(int[] arr, int target, int start, int end){
        while (start<=end){
            int midVal = start+(end-start)/2;
            if (arr[midVal]>target){
                end = midVal-1;
            } else if (arr[midVal]<target) {
                start = midVal+1;
            } else {
                return midVal;
            }
        }
        return -1;
    }
    static int findDesc(int[] arr, int target, int start, int end){
        while (start<=end){
            int midVal = start+(end-start)/2;
            if (arr[midVal]<target){
                end = midVal-1;
            } else if (arr[midVal]>target) {
                start = midVal+1;
            } else {
                return midVal;
            }
        }
        return -1;
    }
}

