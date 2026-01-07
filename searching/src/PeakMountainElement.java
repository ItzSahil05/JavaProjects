public class PeakMountainElement {
    static void main() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 15, 4, 3, 2, 1};
        int ans = PeakElement(arr);
        System.out.println(ans);
    }
    static int PeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int midVal = start+(end-start)/2;
            if (arr[midVal]<arr[midVal+1]) {
                start = midVal+1;
            } else {
                end = midVal;
            }
        }
        return start;
    }
}
