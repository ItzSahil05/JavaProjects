public class SearchInRotatedArray {
    static void main() {
        int[] arr = {7, 0, 1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(findElement(arr, target));
    }
    static int findElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int midValue = start+(end-start)/2;
            if (arr[midValue]==target){
                return midValue;
            }
            if (arr[start]<=arr[midValue]) {
                if (target>=arr[start] && target<arr[midValue]) {
                    end = midValue-1;
                } else {
                    start = midValue+1;
                }
            }
            else {
                if (target>arr[midValue] && target<=arr[end]){
                    start = midValue+1;
                } else {
                    end = midValue-1;
                }
            }
        }
        return -1;
    }
}
