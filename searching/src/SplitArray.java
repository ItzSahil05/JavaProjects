public class SplitArray {
    static void main() {
        int[] arr = {5, 2, 4, 8, 6};
        int k = 2;
        System.out.println(subArray(arr, k));
    }
    static int subArray(int[] nums, int k){
        int start = 0;
        int end = 0;
        for (int n:nums){
            start = Math.max(start, n);
            end+=n;
        }
        while (start<end){
            int midValue = start+(end-start)/2;
            int sum = 0;
            int pieces = 1;
            for (int n:nums){
                if (sum + n >midValue){
                    pieces++;
                    sum = n;
                } else {
                    sum += n;
                }
            }
            if (pieces>k){
                start = midValue+1;
            } else {
                end = midValue;
            }
        }
        return end;
    }
}
